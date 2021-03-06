// Autogenerated AST node
package org.python.parser.ast;
import org.python.parser.SimpleNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class Repr extends exprType {
    public exprType value;

    public Repr(exprType value) {
        this.value = value;
    }

    public Repr(exprType value, SimpleNode parent) {
        this(value);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Repr[");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append("]");
        return sb.toString();
    }

    public void pickle(DataOutputStream ostream) throws IOException {
        pickleThis(36, ostream);
        pickleThis(this.value, ostream);
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitRepr(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null)
            value.accept(visitor);
    }

}
