package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeValidator_mismatch_1931343499235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86594;
     Object term86664;
     Object term86804;
     Object term86902;

    public TypeValidator_mismatch_1931343499235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86594 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term86594, term86594.getClass(), "shouldReport", false);
        term86664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86664, term86664.getClass(), "sourcePosition", 0);
        term86804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamespaceType"));
        term86902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term86664;
        args[2] = "{0}\nfound   : {1}\nrequired: {2}";
        args[3] = term86804;
        args[4] = term86902;
        callMethod(klass, "mismatch", argTypes, term86594, args);
    }

};


