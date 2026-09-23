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

public class PrototypeObjectType_resolveInternal_52987385382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3355;
     Object term10124;
     Object term10087;

    public PrototypeObjectType_resolveInternal_52987385382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3368 = new HashMap();
        term3355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3389 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3355, term3355.getClass(), "className", "UKAReurpHG");
        setField(term3355, term3355.getClass(), "properties", term3368);
        setBooleanField(term3355, term3355.getClass(), "nativeType", false);
        setField(term3355, term3355.getClass(), "implicitPrototypeFallback", null);
        setField(term3380, term3380.getClass(), "call", null);
        setField(term3380, term3380.getClass(), "prototypeSlot", null);
        setField(term3380, term3380.getClass(), "kind", null);
        setField(term3380, term3380.getClass(), "typeOfThis", null);
        setField(term3380, term3380.getClass(), "source", null);
        setField(term3380, term3380.getClass(), "implementedInterfaces", null);
        setField(term3380, term3380.getClass(), "extendedInterfaces", null);
        setField(term3380, term3380.getClass(), "subTypes", null);
        setField(term3380, term3380.getClass(), "templateTypeNames", null);
        setField(term3380, term3380.getClass(), "className", null);
        setField(term3380, term3380.getClass(), "properties", null);
        setBooleanField(term3380, term3380.getClass(), "nativeType", false);
        setField(term3380, term3380.getClass(), "implicitPrototypeFallback", null);
        setField(term3380, term3380.getClass(), "ownerFunction", null);
        setBooleanField(term3380, term3380.getClass(), "prettyPrint", false);
        setBooleanField(term3380, term3380.getClass(), "visited", false);
        setField(term3380, term3380.getClass(), "docInfo", null);
        setBooleanField(term3380, term3380.getClass(), "unknown", false);
        setBooleanField(term3380, term3380.getClass(), "resolved", false);
        setField(term3380, term3380.getClass(), "resolveResult", null);
        setBooleanField(term3380, term3380.getClass(), "inTemplatedCheckVisit", false);
        setField(term3380, term3380.getClass(), "registry", null);
        setField(term3355, term3355.getClass(), "ownerFunction", term3380);
        setBooleanField(term3355, term3355.getClass(), "prettyPrint", false);
        setBooleanField(term3355, term3355.getClass(), "visited", false);
        setField(term3389, term3389.getClass(), "info", null);
        setField(term3389, term3389.getClass(), "documentation", null);
        setField(term3389, term3389.getClass(), "associatedNode", null);
        setField(term3389, term3389.getClass(), "visibility", null);
        setIntField(term3389, term3389.getClass(), "bitset", 0);
        setField(term3389, term3389.getClass(), "type", null);
        setField(term3389, term3389.getClass(), "thisType", null);
        setBooleanField(term3389, term3389.getClass(), "includeDocumentation", false);
        setField(term3355, term3355.getClass(), "docInfo", term3389);
        setBooleanField(term3355, term3355.getClass(), "unknown", false);
        setBooleanField(term3355, term3355.getClass(), "resolved", false);
        setField(term3355, term3355.getClass(), "resolveResult", null);
        setBooleanField(term3355, term3355.getClass(), "inTemplatedCheckVisit", false);
        setField(term3355, term3355.getClass(), "registry", null);
        HashMap term10127 = new HashMap();
        term10124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term10129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10130 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term10124, term10124.getClass(), "className", "UKAReurpHG");
        setField(term10124, term10124.getClass(), "properties", term10127);
        setBooleanField(term10124, term10124.getClass(), "nativeType", false);
        setField(term10124, term10124.getClass(), "implicitPrototypeFallback", null);
        setField(term10129, term10129.getClass(), "call", null);
        setField(term10129, term10129.getClass(), "prototypeSlot", null);
        setField(term10129, term10129.getClass(), "kind", null);
        setField(term10129, term10129.getClass(), "typeOfThis", null);
        setField(term10129, term10129.getClass(), "source", null);
        setField(term10129, term10129.getClass(), "implementedInterfaces", null);
        setField(term10129, term10129.getClass(), "extendedInterfaces", null);
        setField(term10129, term10129.getClass(), "subTypes", null);
        setField(term10129, term10129.getClass(), "templateTypeNames", null);
        setField(term10129, term10129.getClass(), "className", null);
        setField(term10129, term10129.getClass(), "properties", null);
        setBooleanField(term10129, term10129.getClass(), "nativeType", false);
        setField(term10129, term10129.getClass(), "implicitPrototypeFallback", null);
        setField(term10129, term10129.getClass(), "ownerFunction", null);
        setBooleanField(term10129, term10129.getClass(), "prettyPrint", false);
        setBooleanField(term10129, term10129.getClass(), "visited", false);
        setField(term10129, term10129.getClass(), "docInfo", null);
        setBooleanField(term10129, term10129.getClass(), "unknown", false);
        setBooleanField(term10129, term10129.getClass(), "resolved", false);
        setField(term10129, term10129.getClass(), "resolveResult", null);
        setBooleanField(term10129, term10129.getClass(), "inTemplatedCheckVisit", false);
        setField(term10129, term10129.getClass(), "registry", null);
        setField(term10124, term10124.getClass(), "ownerFunction", term10129);
        setBooleanField(term10124, term10124.getClass(), "prettyPrint", false);
        setBooleanField(term10124, term10124.getClass(), "visited", false);
        setField(term10130, term10130.getClass(), "info", null);
        setField(term10130, term10130.getClass(), "documentation", null);
        setField(term10130, term10130.getClass(), "associatedNode", null);
        setField(term10130, term10130.getClass(), "visibility", null);
        setIntField(term10130, term10130.getClass(), "bitset", 0);
        setField(term10130, term10130.getClass(), "type", null);
        setField(term10130, term10130.getClass(), "thisType", null);
        setBooleanField(term10130, term10130.getClass(), "includeDocumentation", false);
        setField(term10124, term10124.getClass(), "docInfo", term10130);
        setBooleanField(term10124, term10124.getClass(), "unknown", false);
        setBooleanField(term10124, term10124.getClass(), "resolved", true);
        setField(term10124, term10124.getClass(), "resolveResult", term10124);
        setBooleanField(term10124, term10124.getClass(), "inTemplatedCheckVisit", false);
        setField(term10124, term10124.getClass(), "registry", null);
        HashMap term10100 = new HashMap();
        term10087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term10107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10116 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term10087, term10087.getClass(), "className", "UKAReurpHG");
        setField(term10087, term10087.getClass(), "properties", term10100);
        setBooleanField(term10087, term10087.getClass(), "nativeType", false);
        setField(term10087, term10087.getClass(), "implicitPrototypeFallback", null);
        setField(term10107, term10107.getClass(), "call", null);
        setField(term10107, term10107.getClass(), "prototypeSlot", null);
        setField(term10107, term10107.getClass(), "kind", null);
        setField(term10107, term10107.getClass(), "typeOfThis", null);
        setField(term10107, term10107.getClass(), "source", null);
        setField(term10107, term10107.getClass(), "implementedInterfaces", null);
        setField(term10107, term10107.getClass(), "extendedInterfaces", null);
        setField(term10107, term10107.getClass(), "subTypes", null);
        setField(term10107, term10107.getClass(), "templateTypeNames", null);
        setField(term10107, term10107.getClass(), "className", null);
        setField(term10107, term10107.getClass(), "properties", null);
        setBooleanField(term10107, term10107.getClass(), "nativeType", false);
        setField(term10107, term10107.getClass(), "implicitPrototypeFallback", null);
        setField(term10107, term10107.getClass(), "ownerFunction", null);
        setBooleanField(term10107, term10107.getClass(), "prettyPrint", false);
        setBooleanField(term10107, term10107.getClass(), "visited", false);
        setField(term10107, term10107.getClass(), "docInfo", null);
        setBooleanField(term10107, term10107.getClass(), "unknown", false);
        setBooleanField(term10107, term10107.getClass(), "resolved", false);
        setField(term10107, term10107.getClass(), "resolveResult", null);
        setBooleanField(term10107, term10107.getClass(), "inTemplatedCheckVisit", false);
        setField(term10107, term10107.getClass(), "registry", null);
        setField(term10087, term10087.getClass(), "ownerFunction", term10107);
        setBooleanField(term10087, term10087.getClass(), "prettyPrint", false);
        setBooleanField(term10087, term10087.getClass(), "visited", false);
        setField(term10116, term10116.getClass(), "info", null);
        setField(term10116, term10116.getClass(), "documentation", null);
        setField(term10116, term10116.getClass(), "associatedNode", null);
        setField(term10116, term10116.getClass(), "visibility", null);
        setIntField(term10116, term10116.getClass(), "bitset", 0);
        setField(term10116, term10116.getClass(), "type", null);
        setField(term10116, term10116.getClass(), "thisType", null);
        setBooleanField(term10116, term10116.getClass(), "includeDocumentation", false);
        setField(term10087, term10087.getClass(), "docInfo", term10116);
        setBooleanField(term10087, term10087.getClass(), "unknown", false);
        setBooleanField(term10087, term10087.getClass(), "resolved", true);
        setField(term10087, term10087.getClass(), "resolveResult", term10087);
        setBooleanField(term10087, term10087.getClass(), "inTemplatedCheckVisit", false);
        setField(term10087, term10087.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "resolveInternal", argTypes, term3355, args);
        assertTrue(recursiveEquals(term3355, term10124));
        assertTrue(recursiveEquals(retValue, term10087));
    }

};


