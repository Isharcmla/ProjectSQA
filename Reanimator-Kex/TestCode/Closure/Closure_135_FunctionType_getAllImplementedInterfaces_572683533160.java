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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_getAllImplementedInterfaces_572683533160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74403;
     Object term75703;
     Object term75697;

    public FunctionType_getAllImplementedInterfaces_572683533160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75711 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term75710 = ((Class) term75711).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term75710).setAccessible(true);
        Object enum163 = ((Field) term75710).get((Object) null);
        ArrayList term74721 = new ArrayList();
        term74403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term74669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term74403, term74403.getClass(), "kind", enum163);
        setField(term74669, term74669.getClass(), "implicitPrototype", null);
        setField(term74403, term74403.getClass(), "prototype", term74669);
        setField(term74403, term74403.getClass(), "implementedInterfaces", term74721);
        Class<? extends Object> term76011 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term76010 = ((Class) term76011).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term76010).setAccessible(true);
        Object enum164 = ((Field) term76010).get((Object) null);
        ArrayList term75708 = new ArrayList();
        term75703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term75704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term75703, term75703.getClass(), "call", null);
        setField(term75704, term75704.getClass(), "ownerFunction", null);
        setField(term75704, term75704.getClass(), "className", null);
        setField(term75704, term75704.getClass(), "properties", null);
        setField(term75704, term75704.getClass(), "implicitPrototype", null);
        setBooleanField(term75704, term75704.getClass(), "nativeType", false);
        setBooleanField(term75704, term75704.getClass(), "visited", false);
        setField(term75704, term75704.getClass(), "docInfo", null);
        setBooleanField(term75704, term75704.getClass(), "unknown", false);
        setBooleanField(term75704, term75704.getClass(), "resolved", false);
        setField(term75704, term75704.getClass(), "resolveResult", null);
        setField(term75704, term75704.getClass(), "registry", null);
        setField(term75703, term75703.getClass(), "prototype", term75704);
        setField(term75703, term75703.getClass(), "kind", enum164);
        setField(term75703, term75703.getClass(), "typeOfThis", null);
        setField(term75703, term75703.getClass(), "source", null);
        setField(term75703, term75703.getClass(), "implementedInterfaces", term75708);
        setField(term75703, term75703.getClass(), "subTypes", null);
        setField(term75703, term75703.getClass(), "templateTypeName", null);
        setField(term75703, term75703.getClass(), "className", null);
        setField(term75703, term75703.getClass(), "properties", null);
        setField(term75703, term75703.getClass(), "implicitPrototype", null);
        setBooleanField(term75703, term75703.getClass(), "nativeType", false);
        setBooleanField(term75703, term75703.getClass(), "visited", false);
        setField(term75703, term75703.getClass(), "docInfo", null);
        setBooleanField(term75703, term75703.getClass(), "unknown", false);
        setBooleanField(term75703, term75703.getClass(), "resolved", false);
        setField(term75703, term75703.getClass(), "resolveResult", null);
        setField(term75703, term75703.getClass(), "registry", null);
        HashMap term75698 = new HashMap();
        Set<Object> term76310 =  ((Map) term75698).keySet();
        term75697 = new HashSet((Collection<? extends Object>) term76310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term74403, args);
        assertTrue(recursiveEquals(term74403, term75703));
        assertTrue(recursiveEquals(retValue, term75697));
    }

};


