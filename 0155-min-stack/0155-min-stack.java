class MinStack {
    Stack<Integer> S1 ;
    Stack<Integer> S2 ;

    public MinStack() {
        S1 = new Stack<>();
        S2 = new Stack<>();
        
    }
    
    public void push(int value) {
        S1.push(value);
        if(S2.isEmpty() || value <= S2.peek()){
            S2.push(value);
        }
        else{
            S2.push(S2.peek());
        }
        
    }
    
    public void pop() {
        S1.pop();
        S2.pop();
    }
    
    public int top() {
        return S1.peek();
    }
    
    public int getMin() {
        return S2.peek();
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