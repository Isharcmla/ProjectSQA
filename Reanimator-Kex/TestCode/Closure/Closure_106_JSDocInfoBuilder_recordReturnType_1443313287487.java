package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JSDocInfoBuilder_recordReturnType_1443313287487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175661;
     Object term175835;

    public JSDocInfoBuilder_recordReturnType_1443313287487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175661 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term175741 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term175741, term175741.getClass(), "bitset", 1073741824);
        setField(term175661, term175661.getClass(), "currentInfo", term175741);
        term175835 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term175835;
        try {
            callMethod(klass, "recordReturnType", argTypes, term175661, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


