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
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_1402626902727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737673;
     Object term738213;

    public FunctionType_setPrototypeNoCheck_1402626902727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term738659 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term738658 = ((Class) term738659).getDeclaredField((String) "ORDINARY");
        ((Field) term738658).setAccessible(true);
        Object enum1176 = ((Field) term738658).get((Object) null);
        term737673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term737787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term737891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term737961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term737891, term737891.getClass(), "ownerFunction", null);
        setField(term737787, term737787.getClass(), "type", term737891);
        setField(term737673, term737673.getClass(), "prototypeSlot", term737787);
        setField(term737673, term737673.getClass(), "source", term737961);
        setField(term737673, term737673.getClass(), "kind", enum1176);
        setBooleanField(term737673, term737673.getClass(), "unknown", false);
        setField(term737673, term737673.getClass(), "subTypes", null);
        setBooleanField(term737673, term737673.getClass(), "nativeType", false);
        Class<? extends Object> term738950 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term738949 = ((Class) term738950).getDeclaredField((String) "INTERFACE");
        ((Field) term738949).setAccessible(true);
        Object enum1177 = ((Field) term738949).get((Object) null);
        term738213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term738401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term738509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term738213, term738213.getClass(), "ownerFunction", null);
        setBooleanField(term738213, term738213.getClass(), "unknown", false);
        setField(term738213, term738213.getClass(), "subTypes", null);
        setBooleanField(term738213, term738213.getClass(), "nativeType", false);
        setField(term738213, term738213.getClass(), "kind", enum1176);
        setBooleanField(term738509, term738509.getClass(), "unknown", false);
        setField(term738509, term738509.getClass(), "subTypes", null);
        setBooleanField(term738509, term738509.getClass(), "nativeType", false);
        setField(term738509, term738509.getClass(), "kind", enum1177);
        setField(term738401, term738401.getClass(), "type", term738509);
        setField(term738213, term738213.getClass(), "prototypeSlot", term738401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term738213;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term737673, args);
    }

};


