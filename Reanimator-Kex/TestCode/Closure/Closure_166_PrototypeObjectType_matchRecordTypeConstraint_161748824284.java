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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_matchRecordTypeConstraint_161748824284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3455;

    public PrototypeObjectType_matchRecordTypeConstraint_161748824284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3468 = new HashMap();
        term3455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3489 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3455, term3455.getClass(), "className", "bxrCBbrrct");
        setField(term3455, term3455.getClass(), "properties", term3468);
        setBooleanField(term3455, term3455.getClass(), "nativeType", true);
        setField(term3455, term3455.getClass(), "implicitPrototypeFallback", null);
        setField(term3480, term3480.getClass(), "call", null);
        setField(term3480, term3480.getClass(), "prototypeSlot", null);
        setField(term3480, term3480.getClass(), "kind", null);
        setField(term3480, term3480.getClass(), "typeOfThis", null);
        setField(term3480, term3480.getClass(), "source", null);
        setField(term3480, term3480.getClass(), "implementedInterfaces", null);
        setField(term3480, term3480.getClass(), "extendedInterfaces", null);
        setField(term3480, term3480.getClass(), "subTypes", null);
        setField(term3480, term3480.getClass(), "templateTypeNames", null);
        setField(term3480, term3480.getClass(), "className", null);
        setField(term3480, term3480.getClass(), "properties", null);
        setBooleanField(term3480, term3480.getClass(), "nativeType", false);
        setField(term3480, term3480.getClass(), "implicitPrototypeFallback", null);
        setField(term3480, term3480.getClass(), "ownerFunction", null);
        setBooleanField(term3480, term3480.getClass(), "prettyPrint", false);
        setBooleanField(term3480, term3480.getClass(), "visited", false);
        setField(term3480, term3480.getClass(), "docInfo", null);
        setBooleanField(term3480, term3480.getClass(), "unknown", false);
        setBooleanField(term3480, term3480.getClass(), "resolved", false);
        setField(term3480, term3480.getClass(), "resolveResult", null);
        setBooleanField(term3480, term3480.getClass(), "inTemplatedCheckVisit", false);
        setField(term3480, term3480.getClass(), "registry", null);
        setField(term3455, term3455.getClass(), "ownerFunction", term3480);
        setBooleanField(term3455, term3455.getClass(), "prettyPrint", false);
        setBooleanField(term3455, term3455.getClass(), "visited", true);
        setField(term3489, term3489.getClass(), "info", null);
        setField(term3489, term3489.getClass(), "documentation", null);
        setField(term3489, term3489.getClass(), "associatedNode", null);
        setField(term3489, term3489.getClass(), "visibility", null);
        setIntField(term3489, term3489.getClass(), "bitset", 0);
        setField(term3489, term3489.getClass(), "type", null);
        setField(term3489, term3489.getClass(), "thisType", null);
        setBooleanField(term3489, term3489.getClass(), "includeDocumentation", false);
        setField(term3455, term3455.getClass(), "docInfo", term3489);
        setBooleanField(term3455, term3455.getClass(), "unknown", false);
        setBooleanField(term3455, term3455.getClass(), "resolved", false);
        setField(term3455, term3455.getClass(), "resolveResult", null);
        setBooleanField(term3455, term3455.getClass(), "inTemplatedCheckVisit", false);
        setField(term3455, term3455.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchRecordTypeConstraint", argTypes, term3455, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


