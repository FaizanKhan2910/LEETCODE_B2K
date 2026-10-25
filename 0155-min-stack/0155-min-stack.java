class Node{
    int val;
    int min;

    public  Node(int v ,int m)

    {
        this.val = v;
        this.min = m;
    }
}
class MinStack {
    Stack<Node> stack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        int min = stack.isEmpty() ? value :
                Math.min(value , stack.peek().min);
                stack.push(new Node(value , min));
    }
    public void pop() {
        stack.pop();
    }
    
    public int top() {
       return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */