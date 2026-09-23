package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class IRFactory_transformTree_16526066679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53905;
     Object term54075;

    public IRFactory_transformTree_16526066679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53905 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.AstRoot"));
        Object term53945 = newInstance(Class.forName("java.util.TreeSet"));
        setIntField(term53905, term53905.getClass(), "type", 136);
        setField(term53905, term53905.getClass(), "first", null);
        setField(term53905, term53905.getClass(), "propListHead", null);
        setIntField(term53905, term53905.getClass(), "lineno", -1);
        setField(term53905, term53905.getClass(), "parent", null);
        setIntField(term53905, term53905.getClass(), "position", 0);
        setIntField(term53905, term53905.getClass(), "length", -1);
        setField(term53905, term53905.getClass(), "comments", term53945);
        Class<? extends Object> term55773 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term55772 = ((Class) term55773).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term55772).setAccessible(true);
        Object enum104 = ((Field) term55772).get((Object) null);
        term54075 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term54075, term54075.getClass(), "languageMode", enum104);
        setBooleanField(term54075, term54075.getClass(), "isIdeMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstRoot");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSourceFile");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.parsing.Config");
        argTypes[4] = Class.forName("com.google.javascript.rhino.head.ErrorReporter");
        Object[] args = new Object[5];
        args[0] = term53905;
        args[1] = null;
        args[2] = "";
        args[3] = term54075;
        args[4] = null;
        try {
            callMethod(klass, "transformTree", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


