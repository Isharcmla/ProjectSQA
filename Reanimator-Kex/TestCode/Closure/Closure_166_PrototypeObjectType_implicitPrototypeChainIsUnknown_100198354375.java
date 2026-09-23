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
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_implicitPrototypeChainIsUnknown_100198354375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2613;
     Object term9141;

    public PrototypeObjectType_implicitPrototypeChainIsUnknown_100198354375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2626 = new HashMap();
        term2613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2647 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2613, term2613.getClass(), "className", "NzBMMhkhpT");
        setField(term2613, term2613.getClass(), "properties", term2626);
        setBooleanField(term2613, term2613.getClass(), "nativeType", true);
        setField(term2613, term2613.getClass(), "implicitPrototypeFallback", null);
        setField(term2638, term2638.getClass(), "call", null);
        setField(term2638, term2638.getClass(), "prototypeSlot", null);
        setField(term2638, term2638.getClass(), "kind", null);
        setField(term2638, term2638.getClass(), "typeOfThis", null);
        setField(term2638, term2638.getClass(), "source", null);
        setField(term2638, term2638.getClass(), "implementedInterfaces", null);
        setField(term2638, term2638.getClass(), "extendedInterfaces", null);
        setField(term2638, term2638.getClass(), "subTypes", null);
        setField(term2638, term2638.getClass(), "templateTypeNames", null);
        setField(term2638, term2638.getClass(), "className", null);
        setField(term2638, term2638.getClass(), "properties", null);
        setBooleanField(term2638, term2638.getClass(), "nativeType", false);
        setField(term2638, term2638.getClass(), "implicitPrototypeFallback", null);
        setField(term2638, term2638.getClass(), "ownerFunction", null);
        setBooleanField(term2638, term2638.getClass(), "prettyPrint", false);
        setBooleanField(term2638, term2638.getClass(), "visited", false);
        setField(term2638, term2638.getClass(), "docInfo", null);
        setBooleanField(term2638, term2638.getClass(), "unknown", false);
        setBooleanField(term2638, term2638.getClass(), "resolved", false);
        setField(term2638, term2638.getClass(), "resolveResult", null);
        setBooleanField(term2638, term2638.getClass(), "inTemplatedCheckVisit", false);
        setField(term2638, term2638.getClass(), "registry", null);
        setField(term2613, term2613.getClass(), "ownerFunction", term2638);
        setBooleanField(term2613, term2613.getClass(), "prettyPrint", true);
        setBooleanField(term2613, term2613.getClass(), "visited", true);
        setField(term2647, term2647.getClass(), "info", null);
        setField(term2647, term2647.getClass(), "documentation", null);
        setField(term2647, term2647.getClass(), "associatedNode", null);
        setField(term2647, term2647.getClass(), "visibility", null);
        setIntField(term2647, term2647.getClass(), "bitset", 0);
        setField(term2647, term2647.getClass(), "type", null);
        setField(term2647, term2647.getClass(), "thisType", null);
        setBooleanField(term2647, term2647.getClass(), "includeDocumentation", false);
        setField(term2613, term2613.getClass(), "docInfo", term2647);
        setBooleanField(term2613, term2613.getClass(), "unknown", true);
        setBooleanField(term2613, term2613.getClass(), "resolved", false);
        setField(term2613, term2613.getClass(), "resolveResult", null);
        setBooleanField(term2613, term2613.getClass(), "inTemplatedCheckVisit", false);
        setField(term2613, term2613.getClass(), "registry", null);
        HashMap term9144 = new HashMap();
        term9141 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9146 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9141, term9141.getClass(), "className", "NzBMMhkhpT");
        setField(term9141, term9141.getClass(), "properties", term9144);
        setBooleanField(term9141, term9141.getClass(), "nativeType", true);
        setField(term9141, term9141.getClass(), "implicitPrototypeFallback", null);
        setField(term9145, term9145.getClass(), "call", null);
        setField(term9145, term9145.getClass(), "prototypeSlot", null);
        setField(term9145, term9145.getClass(), "kind", null);
        setField(term9145, term9145.getClass(), "typeOfThis", null);
        setField(term9145, term9145.getClass(), "source", null);
        setField(term9145, term9145.getClass(), "implementedInterfaces", null);
        setField(term9145, term9145.getClass(), "extendedInterfaces", null);
        setField(term9145, term9145.getClass(), "subTypes", null);
        setField(term9145, term9145.getClass(), "templateTypeNames", null);
        setField(term9145, term9145.getClass(), "className", null);
        setField(term9145, term9145.getClass(), "properties", null);
        setBooleanField(term9145, term9145.getClass(), "nativeType", false);
        setField(term9145, term9145.getClass(), "implicitPrototypeFallback", null);
        setField(term9145, term9145.getClass(), "ownerFunction", null);
        setBooleanField(term9145, term9145.getClass(), "prettyPrint", false);
        setBooleanField(term9145, term9145.getClass(), "visited", false);
        setField(term9145, term9145.getClass(), "docInfo", null);
        setBooleanField(term9145, term9145.getClass(), "unknown", false);
        setBooleanField(term9145, term9145.getClass(), "resolved", false);
        setField(term9145, term9145.getClass(), "resolveResult", null);
        setBooleanField(term9145, term9145.getClass(), "inTemplatedCheckVisit", false);
        setField(term9145, term9145.getClass(), "registry", null);
        setField(term9141, term9141.getClass(), "ownerFunction", term9145);
        setBooleanField(term9141, term9141.getClass(), "prettyPrint", true);
        setBooleanField(term9141, term9141.getClass(), "visited", true);
        setField(term9146, term9146.getClass(), "info", null);
        setField(term9146, term9146.getClass(), "documentation", null);
        setField(term9146, term9146.getClass(), "associatedNode", null);
        setField(term9146, term9146.getClass(), "visibility", null);
        setIntField(term9146, term9146.getClass(), "bitset", 0);
        setField(term9146, term9146.getClass(), "type", null);
        setField(term9146, term9146.getClass(), "thisType", null);
        setBooleanField(term9146, term9146.getClass(), "includeDocumentation", false);
        setField(term9141, term9141.getClass(), "docInfo", term9146);
        setBooleanField(term9141, term9141.getClass(), "unknown", true);
        setBooleanField(term9141, term9141.getClass(), "resolved", false);
        setField(term9141, term9141.getClass(), "resolveResult", null);
        setBooleanField(term9141, term9141.getClass(), "inTemplatedCheckVisit", false);
        setField(term9141, term9141.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "implicitPrototypeChainIsUnknown", argTypes, term2613, args);
        assertTrue(recursiveEquals(term2613, term9141));
        assertTrue(recursiveEquals(retValue, false));
    }

};


