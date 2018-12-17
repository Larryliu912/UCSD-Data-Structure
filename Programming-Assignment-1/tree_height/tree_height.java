import java.util.*;

import sun.jvm.hotspot.debugger.remote.ppc64.RemotePPC64Thread;

import java.io.*;

public class tree_height {
    class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}
		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}
	class Node {
		List<Node> children = new ArrayList<>();
		Node(){}
		void addChild(Node node) {
			children.add(node);
		}
	}
	public class TreeHeight {
		int n;
		int parent[];
		
		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = in.nextInt();
			}
		}
		

		public int buildTree(int[] parent) {
			Node[] nodes = new Node[n];
			int root = 0;
			for (int i = 0; i < n; i++) {
				nodes[i] = new Node();
			}
			for (int i = 0; i < n; i++) {
				if (parent[i] == -1) {
					root = i;
				}
				else{
					nodes[parent[i]].addChild(nodes[i]);
				}
			}
			return root;
		}


		int computeHeight(Node node) {
			if (node.children.isEmpty()) {
				return 0;
			}
			for (Node child : node.children) {
				computeHeight(child);
			}
			return 1;
		}
	}

	static public void main(String[] args) throws IOException {
            new Thread(null, new Runnable() {
                    public void run() {
                        try {
                            new tree_height().run();
                        } catch (IOException e) {
                        }
                    }
                }, "1", 1 << 26).start();
	}
	public void run() throws IOException {
		TreeHeight tree = new TreeHeight();
		tree.read();
		System.out.println(tree.computeHeight());
	}
}
