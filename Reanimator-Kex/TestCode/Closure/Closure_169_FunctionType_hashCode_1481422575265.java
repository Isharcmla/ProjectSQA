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

public class FunctionType_hashCode_1481422575265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256547;

    public FunctionType_hashCode_1481422575265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term257268 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term257267 = ((Class) term257268).getDeclaredField((String) "INTERFACE");
        ((Field) term257267).setAccessible(true);
        Object enum465 = ((Field) term257267).get((Object) null);
        term256547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term256547, term256547.getClass(), "kind", enum465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term256547, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


