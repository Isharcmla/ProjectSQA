package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NameAnalyzer_getRhsSubexpressions_1855552708112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58129;
     Object term58221;

    public NameAnalyzer_getRhsSubexpressions_1855552708112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58129 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term58221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59945 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58221, term58221.getClass(), "type", 130);
        setIntField(term58291, term58291.getClass(), "type", 130);
        setIntField(term58361, term58361.getClass(), "type", 130);
        setIntField(term58431, term58431.getClass(), "type", 130);
        setIntField(term58501, term58501.getClass(), "type", 130);
        setIntField(term58571, term58571.getClass(), "type", 130);
        setIntField(term58641, term58641.getClass(), "type", 130);
        setIntField(term58711, term58711.getClass(), "type", 130);
        setIntField(term58781, term58781.getClass(), "type", 130);
        setIntField(term58851, term58851.getClass(), "type", 130);
        setIntField(term58921, term58921.getClass(), "type", 130);
        setIntField(term58991, term58991.getClass(), "type", 130);
        setIntField(term59061, term59061.getClass(), "type", 130);
        setIntField(term59131, term59131.getClass(), "type", 130);
        setIntField(term59201, term59201.getClass(), "type", 130);
        setIntField(term59271, term59271.getClass(), "type", 130);
        setIntField(term59363, term59363.getClass(), "type", 130);
        setIntField(term59433, term59433.getClass(), "type", 130);
        setIntField(term59503, term59503.getClass(), "type", 130);
        setIntField(term59573, term59573.getClass(), "type", 130);
        setIntField(term59643, term59643.getClass(), "type", 130);
        setIntField(term59713, term59713.getClass(), "type", 130);
        setIntField(term59783, term59783.getClass(), "type", 130);
        setIntField(term59853, term59853.getClass(), "type", 130);
        setIntField(term59945, term59945.getClass(), "type", 130);
        setIntField(term60037, term60037.getClass(), "type", 130);
        setIntField(term60107, term60107.getClass(), "type", 130);
        setIntField(term60177, term60177.getClass(), "type", 130);
        setIntField(term60247, term60247.getClass(), "type", 130);
        setIntField(term60317, term60317.getClass(), "type", 130);
        setIntField(term60409, term60409.getClass(), "type", 130);
        setIntField(term60501, term60501.getClass(), "type", 130);
        setIntField(term60571, term60571.getClass(), "type", 130);
        setIntField(term60641, term60641.getClass(), "type", 130);
        setIntField(term60711, term60711.getClass(), "type", 130);
        setIntField(term60781, term60781.getClass(), "type", 130);
        setIntField(term60851, term60851.getClass(), "type", 130);
        setIntField(term60921, term60921.getClass(), "type", 130);
        setIntField(term60991, term60991.getClass(), "type", 130);
        setIntField(term61083, term61083.getClass(), "type", 130);
        setIntField(term61175, term61175.getClass(), "type", 130);
        setIntField(term61267, term61267.getClass(), "type", 130);
        setIntField(term61337, term61337.getClass(), "type", 130);
        setIntField(term61407, term61407.getClass(), "type", 130);
        setIntField(term61477, term61477.getClass(), "type", 130);
        setIntField(term61547, term61547.getClass(), "type", 130);
        setIntField(term61617, term61617.getClass(), "type", 130);
        setIntField(term61687, term61687.getClass(), "type", 130);
        setIntField(term61757, term61757.getClass(), "type", 130);
        setIntField(term61827, term61827.getClass(), "type", 130);
        setIntField(term61897, term61897.getClass(), "type", 130);
        setIntField(term61967, term61967.getClass(), "type", 130);
        setIntField(term62037, term62037.getClass(), "type", 130);
        setIntField(term62107, term62107.getClass(), "type", 130);
        setIntField(term62177, term62177.getClass(), "type", 130);
        setIntField(term62247, term62247.getClass(), "type", 130);
        setIntField(term62317, term62317.getClass(), "type", 130);
        setIntField(term62387, term62387.getClass(), "type", 130);
        setIntField(term62457, term62457.getClass(), "type", 130);
        setIntField(term62527, term62527.getClass(), "type", 130);
        setIntField(term62597, term62597.getClass(), "type", 130);
        setIntField(term62689, term62689.getClass(), "type", 130);
        setIntField(term62759, term62759.getClass(), "type", 130);
        setField(term62759, term62759.getClass(), "first", term62107);
        setField(term62689, term62689.getClass(), "first", term62759);
        setField(term62597, term62597.getClass(), "first", term62689);
        setField(term62527, term62527.getClass(), "first", term62597);
        setField(term62457, term62457.getClass(), "first", term62527);
        setField(term62387, term62387.getClass(), "first", term62457);
        setField(term62317, term62317.getClass(), "first", term62387);
        setField(term62247, term62247.getClass(), "first", term62317);
        setField(term62177, term62177.getClass(), "first", term62247);
        setField(term62107, term62107.getClass(), "first", term62177);
        setField(term62037, term62037.getClass(), "first", term62107);
        setField(term61967, term61967.getClass(), "first", term62037);
        setField(term61897, term61897.getClass(), "first", term61967);
        setField(term61827, term61827.getClass(), "first", term61897);
        setField(term61757, term61757.getClass(), "first", term61827);
        setField(term61687, term61687.getClass(), "first", term61757);
        setField(term61617, term61617.getClass(), "first", term61687);
        setField(term61547, term61547.getClass(), "first", term61617);
        setField(term61477, term61477.getClass(), "first", term61547);
        setField(term61407, term61407.getClass(), "first", term61477);
        setField(term61337, term61337.getClass(), "first", term61407);
        setField(term61267, term61267.getClass(), "first", term61337);
        setField(term61175, term61175.getClass(), "first", term61267);
        setField(term61083, term61083.getClass(), "first", term61175);
        setField(term60991, term60991.getClass(), "first", term61083);
        setField(term60921, term60921.getClass(), "first", term60991);
        setField(term60851, term60851.getClass(), "first", term60921);
        setField(term60781, term60781.getClass(), "first", term60851);
        setField(term60711, term60711.getClass(), "first", term60781);
        setField(term60641, term60641.getClass(), "first", term60711);
        setField(term60571, term60571.getClass(), "first", term60641);
        setField(term60501, term60501.getClass(), "first", term60571);
        setField(term60409, term60409.getClass(), "first", term60501);
        setField(term60317, term60317.getClass(), "first", term60409);
        setField(term60247, term60247.getClass(), "first", term60317);
        setField(term60177, term60177.getClass(), "first", term60247);
        setField(term60107, term60107.getClass(), "first", term60177);
        setField(term60037, term60037.getClass(), "first", term60107);
        setField(term59945, term59945.getClass(), "first", term60037);
        setField(term59853, term59853.getClass(), "first", term59945);
        setField(term59783, term59783.getClass(), "first", term59853);
        setField(term59713, term59713.getClass(), "first", term59783);
        setField(term59643, term59643.getClass(), "first", term59713);
        setField(term59573, term59573.getClass(), "first", term59643);
        setField(term59503, term59503.getClass(), "first", term59573);
        setField(term59433, term59433.getClass(), "first", term59503);
        setField(term59363, term59363.getClass(), "first", term59433);
        setField(term59271, term59271.getClass(), "first", term59363);
        setField(term59201, term59201.getClass(), "first", term59271);
        setField(term59131, term59131.getClass(), "first", term59201);
        setField(term59061, term59061.getClass(), "first", term59131);
        setField(term58991, term58991.getClass(), "first", term59061);
        setField(term58921, term58921.getClass(), "first", term58991);
        setField(term58851, term58851.getClass(), "first", term58921);
        setField(term58781, term58781.getClass(), "first", term58851);
        setField(term58711, term58711.getClass(), "first", term58781);
        setField(term58641, term58641.getClass(), "first", term58711);
        setField(term58571, term58571.getClass(), "first", term58641);
        setField(term58501, term58501.getClass(), "first", term58571);
        setField(term58431, term58431.getClass(), "first", term58501);
        setField(term58361, term58361.getClass(), "first", term58431);
        setField(term58291, term58291.getClass(), "first", term58361);
        setField(term58221, term58221.getClass(), "first", term58291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term58221;
        try {
            callMethod(klass, "getRhsSubexpressions", argTypes, term58129, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


