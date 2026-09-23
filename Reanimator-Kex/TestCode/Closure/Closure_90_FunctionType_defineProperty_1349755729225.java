package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionType_defineProperty_1349755729225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122888;
     Object term123050;
     Object term123699;
     Object term123703;

    public FunctionType_defineProperty_1349755729225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term123050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term123699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term123700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term123701 = newInstance(Class.forName("java.util.TreeMap"));
        Object term123702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term123699, term123699.getClass(), "call", null);
        setField(term123700, term123700.getClass(), "ownerFunction", term123699);
        setField(term123700, term123700.getClass(), "className", null);
        setField(term123701, term123701.getClass(), "comparator", null);
        setField(term123701, term123701.getClass(), "root", null);
        setIntField(term123701, term123701.getClass(), "size", 0);
        setIntField(term123701, term123701.getClass(), "modCount", 0);
        setField(term123701, term123701.getClass(), "entrySet", null);
        setField(term123701, term123701.getClass(), "navigableKeySet", null);
        setField(term123701, term123701.getClass(), "descendingMap", null);
        setField(term123701, term123701.getClass(), "keySet", null);
        setField(term123701, term123701.getClass(), "values", null);
        setField(term123700, term123700.getClass(), "properties", term123701);
        setBooleanField(term123700, term123700.getClass(), "nativeType", false);
        setField(term123702, term123702.getClass(), "typeExpr", null);
        setField(term123702, term123702.getClass(), "sourceName", null);
        setBooleanField(term123702, term123702.getClass(), "forgiving", false);
        setBooleanField(term123702, term123702.getClass(), "isChecked", false);
        setBooleanField(term123702, term123702.getClass(), "visited", false);
        setField(term123702, term123702.getClass(), "docInfo", null);
        setBooleanField(term123702, term123702.getClass(), "unknown", false);
        setBooleanField(term123702, term123702.getClass(), "resolved", false);
        setField(term123702, term123702.getClass(), "resolveResult", null);
        setField(term123702, term123702.getClass(), "registry", null);
        setField(term123700, term123700.getClass(), "implicitPrototypeFallback", term123702);
        setBooleanField(term123700, term123700.getClass(), "prettyPrint", false);
        setBooleanField(term123700, term123700.getClass(), "visited", false);
        setField(term123700, term123700.getClass(), "docInfo", null);
        setBooleanField(term123700, term123700.getClass(), "unknown", true);
        setBooleanField(term123700, term123700.getClass(), "resolved", false);
        setField(term123700, term123700.getClass(), "resolveResult", null);
        setField(term123700, term123700.getClass(), "registry", null);
        setField(term123699, term123699.getClass(), "prototype", term123700);
        setField(term123699, term123699.getClass(), "kind", null);
        setField(term123699, term123699.getClass(), "typeOfThis", null);
        setField(term123699, term123699.getClass(), "source", null);
        setField(term123699, term123699.getClass(), "implementedInterfaces", null);
        setField(term123699, term123699.getClass(), "subTypes", null);
        setField(term123699, term123699.getClass(), "templateTypeName", null);
        setField(term123699, term123699.getClass(), "className", null);
        setField(term123699, term123699.getClass(), "properties", null);
        setBooleanField(term123699, term123699.getClass(), "nativeType", false);
        setField(term123699, term123699.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term123699, term123699.getClass(), "prettyPrint", false);
        setBooleanField(term123699, term123699.getClass(), "visited", false);
        setField(term123699, term123699.getClass(), "docInfo", null);
        setBooleanField(term123699, term123699.getClass(), "unknown", false);
        setBooleanField(term123699, term123699.getClass(), "resolved", false);
        setField(term123699, term123699.getClass(), "resolveResult", null);
        setField(term123699, term123699.getClass(), "registry", null);
        term123703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term123703, term123703.getClass(), "typeExpr", null);
        setField(term123703, term123703.getClass(), "sourceName", null);
        setBooleanField(term123703, term123703.getClass(), "forgiving", false);
        setBooleanField(term123703, term123703.getClass(), "isChecked", false);
        setBooleanField(term123703, term123703.getClass(), "visited", false);
        setField(term123703, term123703.getClass(), "docInfo", null);
        setBooleanField(term123703, term123703.getClass(), "unknown", false);
        setBooleanField(term123703, term123703.getClass(), "resolved", false);
        setField(term123703, term123703.getClass(), "resolveResult", null);
        setField(term123703, term123703.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "prototype";
        args[1] = term123050;
        args[2] = false;
        args[3] = false;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term122888, args);
        assertTrue(recursiveEquals(term122888, term123699));
        assertTrue(recursiveEquals(term123050, "prototype"));
        assertTrue(recursiveEquals(retValue, true));
    }

};


