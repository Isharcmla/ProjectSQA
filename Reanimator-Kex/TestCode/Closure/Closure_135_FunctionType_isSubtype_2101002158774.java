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
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754709;
     Object term755461;

    public FunctionType_isSubtype_2101002158774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term758687 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term758686 = ((Class) term758687).getDeclaredField((String) "INTERFACE");
        ((Field) term758686).setAccessible(true);
        Object enum1412 = ((Field) term758686).get((Object) null);
        term754709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term755253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term755353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term754709, term754709.getClass(), "kind", enum1412);
        setField(term755253, term755253.getClass(), "kind", enum1412);
        setField(term755253, term755253.getClass(), "typeOfThis", term755353);
        setField(term754709, term754709.getClass(), "typeOfThis", term755253);
        Class<? extends Object> term758981 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term758980 = ((Class) term758981).getDeclaredField((String) "INTERFACE");
        ((Field) term758980).setAccessible(true);
        Object enum1413 = ((Field) term758980).get((Object) null);
        term755461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term755791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term755885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term755461, term755461.getClass(), "kind", enum1412);
        setField(term755791, term755791.getClass(), "kind", enum1413);
        setField(term755791, term755791.getClass(), "typeOfThis", term755885);
        setField(term755461, term755461.getClass(), "typeOfThis", term755791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term755461;
        try {
            callMethod(klass, "isSubtype", argTypes, term754709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


