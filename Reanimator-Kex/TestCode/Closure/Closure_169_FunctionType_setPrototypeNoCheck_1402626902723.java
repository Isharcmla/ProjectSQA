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

public class FunctionType_setPrototypeNoCheck_1402626902723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730851;
     Object term731421;

    public FunctionType_setPrototypeNoCheck_1402626902723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term731941 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term731940 = ((Class) term731941).getDeclaredField((String) "ORDINARY");
        ((Field) term731940).setAccessible(true);
        Object enum1169 = ((Field) term731940).get((Object) null);
        term730851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term730965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term731069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term731169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term731069, term731069.getClass(), "ownerFunction", term731169);
        setField(term730965, term730965.getClass(), "type", term731069);
        setField(term730851, term730851.getClass(), "prototypeSlot", term730965);
        setField(term730851, term730851.getClass(), "source", null);
        setField(term730851, term730851.getClass(), "kind", enum1169);
        setBooleanField(term730851, term730851.getClass(), "unknown", false);
        setField(term730851, term730851.getClass(), "subTypes", null);
        setBooleanField(term730851, term730851.getClass(), "nativeType", false);
        term731421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term731609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term731717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term731831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term731939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term731421, term731421.getClass(), "ownerFunction", null);
        setBooleanField(term731421, term731421.getClass(), "unknown", false);
        setField(term731421, term731421.getClass(), "subTypes", null);
        setBooleanField(term731421, term731421.getClass(), "nativeType", false);
        setField(term731421, term731421.getClass(), "kind", enum1169);
        setBooleanField(term731717, term731717.getClass(), "unknown", false);
        setField(term731717, term731717.getClass(), "subTypes", null);
        setBooleanField(term731717, term731717.getClass(), "nativeType", false);
        setField(term731717, term731717.getClass(), "kind", enum1169);
        setField(term731831, term731831.getClass(), "type", term731939);
        setField(term731717, term731717.getClass(), "prototypeSlot", term731831);
        setField(term731609, term731609.getClass(), "type", term731717);
        setField(term731421, term731421.getClass(), "prototypeSlot", term731609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term731421;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term730851, args);
    }

};


