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
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototypeBasedOn_1012666130225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116503;
     Object term116869;

    public FunctionType_setPrototypeBasedOn_1012666130225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117041 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term117040 = ((Class) term117041).getDeclaredField((String) "ORDINARY");
        ((Field) term117040).setAccessible(true);
        Object enum206 = ((Field) term117040).get((Object) null);
        term116503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term116765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term116503, term116503.getClass(), "nativeType", false);
        setField(term116503, term116503.getClass(), "kind", enum206);
        setField(term116503, term116503.getClass(), "prototype", term116765);
        setField(term116503, term116503.getClass(), "prototypeSlot", null);
        setBooleanField(term116503, term116503.getClass(), "unknown", false);
        setField(term116503, term116503.getClass(), "subTypes", null);
        term116869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term117039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term116869, term116869.getClass(), "className", null);
        setField(term116869, term116869.getClass(), "ownerFunction", null);
        setBooleanField(term116869, term116869.getClass(), "unknown", false);
        setField(term116869, term116869.getClass(), "subTypes", null);
        setBooleanField(term116869, term116869.getClass(), "nativeType", false);
        setField(term116869, term116869.getClass(), "kind", enum206);
        setField(term116869, term116869.getClass(), "prototype", term117039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term116869;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term116503, args);
    }

};


