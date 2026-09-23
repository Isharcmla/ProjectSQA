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
import java.lang.Object;

public class JSType_isSubtype_437021077439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111910;
     Object term112004;
     Object term112162;
     Object term112164;

    public JSType_isSubtype_437021077439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term112004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term112110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term112110, term112110.getClass(), "unknown", false);
        setField(term112004, term112004.getClass(), "referencedType", term112110);
        term112162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term112163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term112162, term112162.getClass(), "reference", null);
        setField(term112162, term112162.getClass(), "sourceName", null);
        setIntField(term112162, term112162.getClass(), "lineno", 0);
        setIntField(term112162, term112162.getClass(), "charno", 0);
        setBooleanField(term112162, term112162.getClass(), "forgiving", false);
        setField(term112163, term112163.getClass(), "primitiveType", null);
        setField(term112163, term112163.getClass(), "primitiveObjectType", null);
        setField(term112163, term112163.getClass(), "name", null);
        setBooleanField(term112163, term112163.getClass(), "visited", false);
        setField(term112163, term112163.getClass(), "docInfo", null);
        setBooleanField(term112163, term112163.getClass(), "unknown", false);
        setBooleanField(term112163, term112163.getClass(), "resolved", false);
        setField(term112163, term112163.getClass(), "resolveResult", null);
        setField(term112163, term112163.getClass(), "registry", null);
        setField(term112162, term112162.getClass(), "referencedType", term112163);
        setBooleanField(term112162, term112162.getClass(), "visited", false);
        setField(term112162, term112162.getClass(), "docInfo", null);
        setBooleanField(term112162, term112162.getClass(), "unknown", false);
        setBooleanField(term112162, term112162.getClass(), "resolved", false);
        setField(term112162, term112162.getClass(), "resolveResult", null);
        setField(term112162, term112162.getClass(), "registry", null);
        term112164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term112164, term112164.getClass(), "resolved", false);
        setField(term112164, term112164.getClass(), "resolveResult", null);
        setField(term112164, term112164.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term111910;
        args[1] = term112004;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term111910, term112162));
        assertTrue(recursiveEquals(term112004, term112164));
        assertTrue(recursiveEquals(retValue, false));
    }

};


