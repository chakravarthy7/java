// Generated from C:/Workspaces/Antlr/AntlrPractice/src/main/resources/Antlr\HelloWorld.g4 by ANTLR 4.7.2
package Antlr;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link HelloWorldVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class HelloWorldBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements HelloWorldVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParser_rule(HelloWorldParser.Parser_ruleContext ctx) { return visitChildren(ctx); }
}