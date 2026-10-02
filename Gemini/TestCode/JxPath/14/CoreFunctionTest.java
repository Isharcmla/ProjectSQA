package org.apache.commons.jxpath.ri.compiler;

import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreFunctionTest {

    private JXPathContextReferenceImpl contextReference;
    private RootContext rootContext;
    private EvalContext evalContext;

    @Before
    public void setUp() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "testValue");
        map.put("empty", "");
        map.put("number", 1234.5);
        map.put("items", Arrays.asList("a", "b", "c"));

        JXPathContext jxpathContext = JXPathContext.newContext(map);
        jxpathContext.setLocale(Locale.US);
        contextReference = (JXPathContextReferenceImpl) jxpathContext;
        rootContext = new RootContext(contextReference, (NodePointer) contextReference.getContextPointer());
        evalContext = new InitialContext(rootContext);
    }

    private EvalContext createListEvalContext(List<?> list) {
        JXPathContext jxpathContext = JXPathContext.newContext(list);
        JXPathContextReferenceImpl ref = (JXPathContextReferenceImpl) jxpathContext;
        RootContext root = new RootContext(ref, (NodePointer) ref.getContextPointer());
        EvalContext initCtx = new InitialContext(root);
        CoreOperationEqual expr = new CoreOperationEqual(
                new LocationPath(false, new Step[0]),
                new Constant("dummy")
        );
        BasicNodeSet nodeSet = new BasicNodeSet();
        for (Pointer p : jxpathContext.iteratePointers("*")) {
            nodeSet.add(p);
        }
        return new NodeSetContext(initCtx, nodeSet);
    }

    @Test
    public void testGetFunctionCode() {
        CoreFunction cf = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        Assert.assertEquals(Compiler.FUNCTION_LAST, cf.getFunctionCode());
    }

    @Test
    public void testGetArgumentCount_nullAndValues() {
        CoreFunction cfNull = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        Assert.assertEquals(0, cfNull.getArgumentCount());

        Expression[] args = new Expression[]{new Constant("a"), new Constant("b"), new Constant("c")};
        CoreFunction cf3 = new CoreFunction(Compiler.FUNCTION_TRANSLATE, args);
        Assert.assertEquals(3, cf3.getArgumentCount());
        Assert.assertSame(args[0], cf3.getArg1());
        Assert.assertSame(args[1], cf3.getArg2());
        Assert.assertSame(args[2], cf3.getArg3());
    }

    @Test
    public void testGetFunctionName_allCases() {
        int[] codes = {
                Compiler.FUNCTION_LAST, Compiler.FUNCTION_POSITION, Compiler.FUNCTION_COUNT,
                Compiler.FUNCTION_ID, Compiler.FUNCTION_LOCAL_NAME, Compiler.FUNCTION_NAMESPACE_URI,
                Compiler.FUNCTION_NAME, Compiler.FUNCTION_STRING, Compiler.FUNCTION_CONCAT,
                Compiler.FUNCTION_STARTS_WITH, Compiler.FUNCTION_CONTAINS, Compiler.FUNCTION_SUBSTRING_BEFORE,
                Compiler.FUNCTION_SUBSTRING_AFTER, Compiler.FUNCTION_SUBSTRING, Compiler.FUNCTION_STRING_LENGTH,
                Compiler.FUNCTION_NORMALIZE_SPACE, Compiler.FUNCTION_TRANSLATE, Compiler.FUNCTION_BOOLEAN,
                Compiler.FUNCTION_NOT, Compiler.FUNCTION_TRUE, Compiler.FUNCTION_FALSE,
                Compiler.FUNCTION_LANG, Compiler.FUNCTION_NUMBER, Compiler.FUNCTION_SUM,
                Compiler.FUNCTION_FLOOR, Compiler.FUNCTION_CEILING, Compiler.FUNCTION_ROUND,
                Compiler.FUNCTION_KEY, Compiler.FUNCTION_FORMAT_NUMBER
        };
        for (int code : codes) {
            CoreFunction cf = new CoreFunction(code, new Expression[0]);
            String name = cf.getFunctionName();
            Assert.assertNotNull(name);
            Assert.assertFalse(name.startsWith("unknownFunction"));
        }

        CoreFunction unknown = new CoreFunction(9999, new Expression[0]);
        Assert.assertEquals("unknownFunction9999()", unknown.getFunctionName());
    }

    @Test
    public void testComputeContextDependent() {
        CoreFunction last = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        Assert.assertTrue(last.computeContextDependent());

        CoreFunction pos = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        Assert.assertTrue(pos.computeContextDependent());

        int[] zeroArgDep = {
                Compiler.FUNCTION_BOOLEAN, Compiler.FUNCTION_LOCAL_NAME, Compiler.FUNCTION_NAME,
                Compiler.FUNCTION_NAMESPACE_URI, Compiler.FUNCTION_STRING, Compiler.FUNCTION_LANG,
                Compiler.FUNCTION_NUMBER
        };
        for (int code : zeroArgDep) {
            CoreFunction noArgs = new CoreFunction(code, new Expression[0]);
            Assert.assertTrue(noArgs.computeContextDependent());

            CoreFunction withArgs = new CoreFunction(code, new Expression[]{new Constant("x")});
            Assert.assertFalse(withArgs.computeContextDependent());
        }

        int[] nonDep = {
                Compiler.FUNCTION_COUNT, Compiler.FUNCTION_ID, Compiler.FUNCTION_CONCAT,
                Compiler.FUNCTION_STARTS_WITH, Compiler.FUNCTION_CONTAINS, Compiler.FUNCTION_SUBSTRING_BEFORE,
                Compiler.FUNCTION_SUBSTRING_AFTER, Compiler.FUNCTION_SUBSTRING, Compiler.FUNCTION_STRING_LENGTH,
                Compiler.FUNCTION_NORMALIZE_SPACE, Compiler.FUNCTION_TRANSLATE, Compiler.FUNCTION_NOT,
                Compiler.FUNCTION_TRUE, Compiler.FUNCTION_FALSE, Compiler.FUNCTION_SUM,
                Compiler.FUNCTION_FLOOR, Compiler.FUNCTION_CEILING, Compiler.FUNCTION_ROUND
        };
        for (int code : nonDep) {
            CoreFunction cf = new CoreFunction(code, new Expression[]{new Constant("x")});
            Assert.assertFalse(cf.computeContextDependent());
        }

        CoreFunction fmt2 = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{new Constant(1), new Constant("#")});
        Assert.assertTrue(fmt2.computeContextDependent());

        CoreFunction fmt3 = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{new Constant(1), new Constant("#"), new Constant("sym")});
        Assert.assertFalse(fmt3.computeContextDependent());

        CoreFunction unknown = new CoreFunction(9999, new Expression[0]);
        Assert.assertFalse(unknown.computeContextDependent());
    }

    @Test
    public void testToString() {
        CoreFunction cf0 = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        Assert.assertEquals("true()", cf0.toString());

        CoreFunction cf1 = new CoreFunction(Compiler.FUNCTION_NOT, new Expression[]{new Constant(true)});
        Assert.assertEquals("not('true')", cf1.toString());

        CoreFunction cfConcat = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{new Constant("a"), new Constant("b")});
        Assert.assertEquals("concat('a', 'b')", cfConcat.toString());
    }

    @Test
    public void testComputeAndComputeValue_unknownFunction() {
        CoreFunction unknown = new CoreFunction(9999, new Expression[0]);
        Assert.assertNull(unknown.compute(evalContext));
        Assert.assertNull(unknown.computeValue(evalContext));
    }

    @Test
    public void testFunctionLastAndPosition() {
        List<String> list = Arrays.asList("1", "2", "3");
        EvalContext ctx = createListEvalContext(list);
        ctx.nextNode(); // at 1
        ctx.nextNode(); // at 2

        CoreFunction pos = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[0]);
        Assert.assertEquals(2, ((Integer) pos.compute(ctx)).intValue());

        CoreFunction last = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        Assert.assertEquals(3.0, (Double) last.compute(ctx), 0.001);
        Assert.assertEquals(2, ctx.getCurrentPosition());
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLast_invalidArgCount() {
        CoreFunction last = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[]{new Constant(1)});
        last.compute(evalContext);
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionPosition_invalidArgCount() {
        CoreFunction pos = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[]{new Constant(1)});
        pos.compute(evalContext);
    }

    @Test
    public void testFunctionCount() {
        CoreFunction countColl = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[]{new Constant(Arrays.asList("x", "y"))});
        Assert.assertEquals(2.0, (Double) countColl.compute(evalContext), 0.001);

        CoreFunction countNull = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[]{new CoreFunction(Compiler.FUNCTION_NULL, new Expression[0])});
        Assert.assertEquals(0.0, (Double) countNull.compute(evalContext), 0.001);

        CoreFunction countScalar = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[]{new Constant("single")});
        Assert.assertEquals(1.0, (Double) countScalar.compute(evalContext), 0.001);

        EvalContext ctxList = createListEvalContext(Arrays.asList("a", "b", "c"));
        Expression pathExpr = new LocationPath(false, new Step[0]) {
            @Override
            public Object compute(EvalContext context) {
                return ctxList;
            }
        };
        CoreFunction countCtx = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[]{pathExpr});
        Assert.assertEquals(3.0, (Double) countCtx.compute(evalContext), 0.001);
    }

    @Test
    public void testFunctionLang() {
        CoreFunction langEn = new CoreFunction(Compiler.FUNCTION_LANG, new Expression[]{new Constant("en")});
        evalContext.nextNode();
        Assert.assertEquals(Boolean.TRUE, langEn.compute(evalContext));

        CoreFunction langFr = new CoreFunction(Compiler.FUNCTION_LANG, new Expression[]{new Constant("fr")});
        Assert.assertEquals(Boolean.FALSE, langFr.compute(evalContext));

        EvalContext emptyCtx = new InitialContext(rootContext);
        Assert.assertEquals(Boolean.FALSE, langEn.compute(emptyCtx));
    }

    @Test
    public void testFunctionID() {
        CoreFunction idFunc = new CoreFunction(Compiler.FUNCTION_ID, new Expression[]{new Constant("id123")});
        Object result = idFunc.compute(evalContext);
        Assert.assertNull(result);
    }

    @Test
    public void testFunctionKey() {
        contextReference.registerKeyManager((context, keyName, keyValue) -> {
            BasicNodeSet ns = new BasicNodeSet();
            if ("testKey".equals(keyName) && "val1".equals(keyValue)) {
                ns.add(context.getPointer("/name"));
            } else if ("testKey".equals(keyName) && "val2".equals(keyValue)) {
                ns.add(context.getPointer("/number"));
            }
            return ns;
        });

        CoreFunction keySingle = new CoreFunction(Compiler.FUNCTION_KEY, new Expression[]{new Constant("testKey"), new Constant("val1")});
        Object resSingle = keySingle.compute(evalContext);
        Assert.assertTrue(resSingle instanceof NodeSetContext);
        Assert.assertEquals(1, ((NodeSetContext) resSingle).getNodeSet().getPointers().size());

        EvalContext emptyCtx = createListEvalContext(Collections.emptyList());
        Expression emptyExpr = new LocationPath(false, new Step[0]) {
            @Override
            public Object compute(EvalContext context) {
                return emptyCtx;
            }
        };
        CoreFunction keyEmptyCtx = new CoreFunction(Compiler.FUNCTION_KEY, new Expression[]{new Constant("testKey"), emptyExpr});
        Object resEmpty = keyEmptyCtx.compute(evalContext);
        Assert.assertTrue(resEmpty instanceof BasicNodeSet);
        Assert.assertTrue(((BasicNodeSet) resEmpty).getPointers().isEmpty());

        EvalContext multiCtx = createListEvalContext(Arrays.asList("val1", "val2"));
        Expression multiExpr = new LocationPath(false, new Step[0]) {
            @Override
            public Object compute(EvalContext context) {
                return multiCtx;
            }
        };
        CoreFunction keyMulti = new CoreFunction(Compiler.FUNCTION_KEY, new Expression[]{new Constant("testKey"), multiExpr});
        Object resMulti = keyMulti.compute(evalContext);
        Assert.assertTrue(resMulti instanceof NodeSetContext);
        Assert.assertEquals(2, ((NodeSetContext) resMulti).getNodeSet().getPointers().size());
    }

    @Test
    public void testFunctionNamespaceURI_LocalName_Name() {
        evalContext.nextNode();

        CoreFunction uri0 = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[0]);
        Assert.assertEquals("", uri0.compute(evalContext));

        CoreFunction local0 = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[0]);
        Assert.assertEquals("", local0.compute(evalContext));

        CoreFunction name0 = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[0]);
        Assert.assertEquals("", name0.compute(evalContext));

        EvalContext ctxList = createListEvalContext(Arrays.asList("a"));
        Expression pathExpr = new LocationPath(false, new Step[0]) {
            @Override
            public Object compute(EvalContext context) {
                return ctxList;
            }
        };

        CoreFunction uri1 = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[]{pathExpr});
        Assert.assertEquals("", uri1.compute(evalContext));

        CoreFunction local1 = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[]{pathExpr});
        Assert.assertEquals("", local1.compute(evalContext));

        CoreFunction name1 = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[]{pathExpr});
        Assert.assertEquals("", name1.compute(evalContext));

        CoreFunction uriScalar = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[]{new Constant("notCtx")});
        Assert.assertEquals("", uriScalar.compute(evalContext));

        CoreFunction localScalar = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[]{new Constant("notCtx")});
        Assert.assertEquals("", localScalar.compute(evalContext));

        CoreFunction nameScalar = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[]{new Constant("notCtx")});
        Assert.assertEquals("", nameScalar.compute(evalContext));
    }

    @Test
    public void testFunctionString() {
        evalContext.nextNode();
        CoreFunction str0 = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[0]);
        Assert.assertNotNull(str0.compute(evalContext));

        CoreFunction str1 = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[]{new Constant(123)});
        Assert.assertEquals("123", str1.compute(evalContext));
    }

    @Test
    public void testFunctionConcat() {
        CoreFunction concat = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{
                new Constant("foo"), new Constant("bar"), new Constant("baz")
        });
        Assert.assertEquals("foobarbaz", concat.compute(evalContext));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionConcat_lessThan2Args() {
        CoreFunction concat = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[]{new Constant("foo")});
        concat.compute(evalContext);
    }

    @Test
    public void testFunctionStartsWith_Contains() {
        CoreFunction startsTrue = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[]{new Constant("hello"), new Constant("hel")});
        Assert.assertEquals(Boolean.TRUE, startsTrue.compute(evalContext));

        CoreFunction startsFalse = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[]{new Constant("hello"), new Constant("world")});
        Assert.assertEquals(Boolean.FALSE, startsFalse.compute(evalContext));

        CoreFunction containsTrue = new CoreFunction(Compiler.FUNCTION_CONTAINS, new Expression[]{new Constant("hello"), new Constant("ell")});
        Assert.assertEquals(Boolean.TRUE, containsTrue.compute(evalContext));

        CoreFunction containsFalse = new CoreFunction(Compiler.FUNCTION_CONTAINS, new Expression[]{new Constant("hello"), new Constant("xyz")});
        Assert.assertEquals(Boolean.FALSE, containsFalse.compute(evalContext));
    }

    @Test
    public void testFunctionSubstringBefore_SubstringAfter() {
        CoreFunction beforeMatch = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, new Expression[]{new Constant("1999/04/01"), new Constant("/")});
        Assert.assertEquals("1999", beforeMatch.compute(evalContext));

        CoreFunction beforeNoMatch = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, new Expression[]{new Constant("1999/04/01"), new Constant("-")});
        Assert.assertEquals("", beforeNoMatch.compute(evalContext));

        CoreFunction afterMatch = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, new Expression[]{new Constant("1999/04/01"), new Constant("/")});
        Assert.assertEquals("04/01", afterMatch.compute(evalContext));

        CoreFunction afterNoMatch = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, new Expression[]{new Constant("1999/04/01"), new Constant("-")});
        Assert.assertEquals("", afterNoMatch.compute(evalContext));
    }

    @Test
    public void testFunctionSubstring() {
        CoreFunction sub2 = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(2)});
        Assert.assertEquals("2345", sub2.compute(evalContext));

        CoreFunction sub2Negative = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(-1)});
        Assert.assertEquals("12345", sub2Negative.compute(evalContext));

        CoreFunction sub3 = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(2), new Constant(3)});
        Assert.assertEquals("234", sub3.compute(evalContext));

        CoreFunction subNaN = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(Double.NaN)});
        Assert.assertEquals("", subNaN.compute(evalContext));

        CoreFunction subTooBig = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(10)});
        Assert.assertEquals("", subTooBig.compute(evalContext));

        CoreFunction subNegLen = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(2), new Constant(-1)});
        Assert.assertEquals("", subNegLen.compute(evalContext));

        CoreFunction subToSmall = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(-5), new Constant(2)});
        Assert.assertEquals("", subToSmall.compute(evalContext));

        CoreFunction subToLarge = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(-1), new Constant(10)});
        Assert.assertEquals("12345", subToLarge.compute(evalContext));

        CoreFunction subNegativeStart = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345"), new Constant(0), new Constant(3)});
        Assert.assertEquals("12", subNegativeStart.compute(evalContext));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionSubstring_invalidArgCount() {
        CoreFunction sub = new CoreFunction(Compiler.FUNCTION_SUBSTRING, new Expression[]{new Constant("12345")});
        sub.compute(evalContext);
    }

    @Test
    public void testFunctionStringLength() {
        evalContext.nextNode();
        CoreFunction len0 = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, new Expression[0]);
        Assert.assertTrue((Double) len0.compute(evalContext) >= 0.0);

        CoreFunction len1 = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, new Expression[]{new Constant("hello")});
        Assert.assertEquals(5.0, (Double) len1.compute(evalContext), 0.001);
    }

    @Test
    public void testFunctionNormalizeSpace() {
        CoreFunction norm = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[]{new Constant("  hello \t world \r\n ") });
        Assert.assertEquals("hello world", norm.compute(evalContext));

        CoreFunction emptyNorm = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, new Expression[]{new Constant("   ") });
        Assert.assertEquals("", emptyNorm.compute(evalContext));
    }

    @Test
    public void testFunctionTranslate() {
        CoreFunction trans = new CoreFunction(Compiler.FUNCTION_TRANSLATE, new Expression[]{
                new Constant("--abc--"), new Constant("abc-"), new Constant("ABC")
        });
        Assert.assertEquals("ABC", trans.compute(evalContext));
    }

    @Test
    public void testFunctionBooleanAndNot() {
        CoreFunction boolTrue = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[]{new Constant(1)});
        Assert.assertEquals(Boolean.TRUE, boolTrue.compute(evalContext));

        CoreFunction boolFalse = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[]{new Constant(0)});
        Assert.assertEquals(Boolean.FALSE, boolFalse.compute(evalContext));

        CoreFunction notTrue = new CoreFunction(Compiler.FUNCTION_NOT, new Expression[]{new Constant(1)});
        Assert.assertEquals(Boolean.FALSE, notTrue.compute(evalContext));

        CoreFunction notFalse = new CoreFunction(Compiler.FUNCTION_NOT, new Expression[]{new Constant(0)});
        Assert.assertEquals(Boolean.TRUE, notFalse.compute(evalContext));
    }

    @Test
    public void testFunctionTrue_False_Null() {
        CoreFunction fTrue = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        Assert.assertEquals(Boolean.TRUE, fTrue.compute(evalContext));

        CoreFunction fFalse = new CoreFunction(Compiler.FUNCTION_FALSE, new Expression[0]);
        Assert.assertEquals(Boolean.FALSE, fFalse.compute(evalContext));

        CoreFunction fNull = new CoreFunction(Compiler.FUNCTION_NULL, new Expression[0]);
        Assert.assertNull(fNull.compute(evalContext));
    }

    @Test
    public void testFunctionNumber() {
        evalContext.nextNode();
        CoreFunction num0 = new CoreFunction(Compiler.FUNCTION_NUMBER, new Expression[0]);
        Assert.assertNotNull(num0.compute(evalContext));

        CoreFunction num1 = new CoreFunction(Compiler.FUNCTION_NUMBER, new Expression[]{new Constant("42.5")});
        Assert.assertEquals(42.5, (Double) num1.compute(evalContext), 0.001);
    }

    @Test
    public void testFunctionSum() {
        EvalContext ctxList = createListEvalContext(Arrays.asList(10, 20, 30));
        Expression pathExpr = new LocationPath(false, new Step[0]) {
            @Override
            public Object compute(EvalContext context) {
                return ctxList;
            }
        };
        CoreFunction sumCtx = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[]{pathExpr});
        Assert.assertEquals(60.0, (Double) sumCtx.compute(evalContext), 0.001);

        CoreFunction sumNull = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[]{new CoreFunction(Compiler.FUNCTION_NULL, new Expression[0])});
        Assert.assertEquals(0.0, (Double) sumNull.compute(evalContext), 0.001);
    }

    @Test(expected = JXPathException.class)
    public void testFunctionSum_invalidType() {
        CoreFunction sumInvalid = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[]{new Constant("string")});
        sumInvalid.compute(evalContext);
    }

    @Test
    public void testFunctionFloor_Ceiling_Round() {
        CoreFunction floor = new CoreFunction(Compiler.FUNCTION_FLOOR, new Expression[]{new Constant(1.9)});
        Assert.assertEquals(1.0, (Double) floor.compute(evalContext), 0.001);

        CoreFunction ceil = new CoreFunction(Compiler.FUNCTION_CEILING, new Expression[]{new Constant(1.1)});
        Assert.assertEquals(2.0, (Double) ceil.compute(evalContext), 0.001);

        CoreFunction round = new CoreFunction(Compiler.FUNCTION_ROUND, new Expression[]{new Constant(1.5)});
        Assert.assertEquals(2.0, (Double) round.compute(evalContext), 0.001);
    }

    @Test
    public void testFunctionFormatNumber() {
        evalContext.nextNode();
        CoreFunction fmt2 = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{
                new Constant(1234.56), new Constant("###,###.00")
        });
        Assert.assertEquals("1,234.56", fmt2.compute(evalContext));

        EvalContext emptyCtx = new InitialContext(rootContext);
        CoreFunction fmt2NoPointer = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{
                new Constant(1234.5), new Constant("###0.00")
        });
        Assert.assertEquals("1234.50", fmt2NoPointer.compute(emptyCtx));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.GERMAN);
        contextReference.setDecimalFormatSymbols("custom", dfs);
        CoreFunction fmt3 = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{
                new Constant(1234.56), new Constant("###,###.00"), new Constant("custom")
        });
        Assert.assertEquals("1.234,56", fmt3.compute(evalContext));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionFormatNumber_invalidArgCount() {
        CoreFunction fmt = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[]{new Constant(1)});
        fmt.compute(evalContext);
    }
}
