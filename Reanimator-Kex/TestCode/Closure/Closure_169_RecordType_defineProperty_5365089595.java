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
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class RecordType_defineProperty_5365089595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682;
     Object term753;
     Object term755;

    public RecordType_defineProperty_5365089595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term714 = new HashMap();
        term682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term683 = newInstance(Class.forName("java.util.TreeMap"));
        Object term684 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term735 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term683, term683.getClass(), "comparator", null);
        setField(term684, term684.getClass(), "key", "hCWPJQKpdc");
        setField(term684, term684.getClass(), "value", null);
        setField(term684, term684.getClass(), "left", null);
        setField(term684, term684.getClass(), "right", null);
        setField(term684, term684.getClass(), "parent", null);
        setBooleanField(term684, term684.getClass(), "color", true);
        setField(term683, term683.getClass(), "root", term684);
        setIntField(term683, term683.getClass(), "size", 1);
        setIntField(term683, term683.getClass(), "modCount", 1);
        setField(term683, term683.getClass(), "entrySet", null);
        setField(term683, term683.getClass(), "navigableKeySet", null);
        setField(term683, term683.getClass(), "descendingMap", null);
        setField(term683, term683.getClass(), "keySet", null);
        setField(term683, term683.getClass(), "values", null);
        setField(term682, term682.getClass(), "properties", term683);
        setBooleanField(term682, term682.getClass(), "declared", true);
        setBooleanField(term682, term682.getClass(), "isFrozen", false);
        setField(term682, term682.getClass(), "className", "WzMEhMXkKx");
        setField(term682, term682.getClass(), "properties", term714);
        setBooleanField(term682, term682.getClass(), "nativeType", false);
        setField(term682, term682.getClass(), "implicitPrototypeFallback", null);
        setField(term726, term726.getClass(), "call", null);
        setField(term726, term726.getClass(), "prototypeSlot", null);
        setField(term726, term726.getClass(), "kind", null);
        setField(term726, term726.getClass(), "propAccess", null);
        setField(term726, term726.getClass(), "typeOfThis", null);
        setField(term726, term726.getClass(), "source", null);
        setField(term726, term726.getClass(), "implementedInterfaces", null);
        setField(term726, term726.getClass(), "extendedInterfaces", null);
        setField(term726, term726.getClass(), "subTypes", null);
        setField(term726, term726.getClass(), "templateTypeNames", null);
        setField(term726, term726.getClass(), "className", null);
        setField(term726, term726.getClass(), "properties", null);
        setBooleanField(term726, term726.getClass(), "nativeType", false);
        setField(term726, term726.getClass(), "implicitPrototypeFallback", null);
        setField(term726, term726.getClass(), "ownerFunction", null);
        setBooleanField(term726, term726.getClass(), "prettyPrint", false);
        setBooleanField(term726, term726.getClass(), "visited", false);
        setField(term726, term726.getClass(), "docInfo", null);
        setBooleanField(term726, term726.getClass(), "unknown", false);
        setBooleanField(term726, term726.getClass(), "resolved", false);
        setField(term726, term726.getClass(), "resolveResult", null);
        setBooleanField(term726, term726.getClass(), "inTemplatedCheckVisit", false);
        setField(term726, term726.getClass(), "registry", null);
        setField(term682, term682.getClass(), "ownerFunction", term726);
        setBooleanField(term682, term682.getClass(), "prettyPrint", false);
        setBooleanField(term682, term682.getClass(), "visited", true);
        setField(term735, term735.getClass(), "info", null);
        setField(term735, term735.getClass(), "documentation", null);
        setField(term735, term735.getClass(), "associatedNode", null);
        setField(term735, term735.getClass(), "visibility", null);
        setIntField(term735, term735.getClass(), "bitset", 0);
        setField(term735, term735.getClass(), "type", null);
        setField(term735, term735.getClass(), "thisType", null);
        setBooleanField(term735, term735.getClass(), "includeDocumentation", false);
        setField(term682, term682.getClass(), "docInfo", term735);
        setBooleanField(term682, term682.getClass(), "unknown", false);
        setBooleanField(term682, term682.getClass(), "resolved", false);
        setField(term682, term682.getClass(), "resolveResult", null);
        setBooleanField(term682, term682.getClass(), "inTemplatedCheckVisit", false);
        setField(term682, term682.getClass(), "registry", null);
        term753 = new Boolean(false);
        term755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term755, term755.getClass(), "type", -1885090354);
        setIntField(term757, term757.getClass(), "type", -2066804303);
        setIntField(term759, term759.getClass(), "type", -1731761810);
        setIntField(term761, term761.getClass(), "type", 197109649);
        setIntField(term763, term763.getClass(), "type", -1239406390);
        setField(term763, term763.getClass(), "next", null);
        setField(term763, term763.getClass(), "first", null);
        setField(term763, term763.getClass(), "last", null);
        setField(term763, term763.getClass(), "propListHead", null);
        setIntField(term763, term763.getClass(), "sourcePosition", 0);
        setField(term763, term763.getClass(), "jsType", null);
        setField(term763, term763.getClass(), "parent", null);
        setField(term761, term761.getClass(), "next", term763);
        setIntField(term766, term766.getClass(), "type", 1557431527);
        setField(term766, term766.getClass(), "next", null);
        setField(term766, term766.getClass(), "first", null);
        setField(term766, term766.getClass(), "last", term763);
        setField(term766, term766.getClass(), "propListHead", null);
        setIntField(term766, term766.getClass(), "sourcePosition", 0);
        setField(term766, term766.getClass(), "jsType", null);
        setField(term766, term766.getClass(), "parent", null);
        setField(term761, term761.getClass(), "first", term766);
        setField(term761, term761.getClass(), "last", term759);
        setField(term761, term761.getClass(), "propListHead", null);
        setIntField(term761, term761.getClass(), "sourcePosition", 0);
        setField(term761, term761.getClass(), "jsType", null);
        setField(term761, term761.getClass(), "parent", null);
        setField(term759, term759.getClass(), "next", term761);
        setField(term759, term759.getClass(), "first", term763);
        setIntField(term770, term770.getClass(), "type", 1358829571);
        setIntField(term772, term772.getClass(), "type", 991356662);
        setField(term772, term772.getClass(), "next", null);
        setField(term772, term772.getClass(), "first", term766);
        setField(term772, term772.getClass(), "last", term761);
        setField(term772, term772.getClass(), "propListHead", null);
        setIntField(term772, term772.getClass(), "sourcePosition", 0);
        setField(term772, term772.getClass(), "jsType", null);
        setField(term772, term772.getClass(), "parent", null);
        setField(term770, term770.getClass(), "next", term772);
        setField(term770, term770.getClass(), "first", term757);
        setField(term770, term770.getClass(), "last", term757);
        setField(term770, term770.getClass(), "propListHead", null);
        setIntField(term770, term770.getClass(), "sourcePosition", 0);
        setField(term770, term770.getClass(), "jsType", null);
        setField(term770, term770.getClass(), "parent", null);
        setField(term759, term759.getClass(), "last", term770);
        setField(term759, term759.getClass(), "propListHead", null);
        setIntField(term759, term759.getClass(), "sourcePosition", 0);
        setField(term759, term759.getClass(), "jsType", null);
        setField(term759, term759.getClass(), "parent", null);
        setField(term757, term757.getClass(), "next", term759);
        setIntField(term777, term777.getClass(), "type", -506958186);
        setField(term777, term777.getClass(), "next", term770);
        setField(term777, term777.getClass(), "first", term772);
        setField(term777, term777.getClass(), "last", term755);
        setField(term777, term777.getClass(), "propListHead", null);
        setIntField(term777, term777.getClass(), "sourcePosition", 0);
        setField(term777, term777.getClass(), "jsType", null);
        setField(term777, term777.getClass(), "parent", null);
        setField(term757, term757.getClass(), "first", term777);
        setField(term757, term757.getClass(), "last", term777);
        setField(term757, term757.getClass(), "propListHead", null);
        setIntField(term757, term757.getClass(), "sourcePosition", 0);
        setField(term757, term757.getClass(), "jsType", null);
        setField(term757, term757.getClass(), "parent", null);
        setField(term755, term755.getClass(), "next", term757);
        setField(term755, term755.getClass(), "first", term761);
        setField(term755, term755.getClass(), "last", term763);
        setField(term755, term755.getClass(), "propListHead", null);
        setIntField(term755, term755.getClass(), "sourcePosition", 0);
        setField(term755, term755.getClass(), "jsType", null);
        setField(term755, term755.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = "lHfTrWKMPk";
        args[1] = null;
        args[2] = term753;
        args[3] = term755;
        callMethod(klass, "defineProperty", argTypes, term682, args);
    }

};


