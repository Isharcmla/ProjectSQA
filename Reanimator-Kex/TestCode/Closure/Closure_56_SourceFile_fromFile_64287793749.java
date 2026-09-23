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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class SourceFile_fromFile_64287793749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1648;
     Object term5533;
     Object term5473;

    public SourceFile_fromFile_64287793749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5550 = Class.forName((String) "java.io.File$PathStatus");
        Field term5549 = ((Class) term5550).getDeclaredField((String) "INVALID");
        ((Field) term5549).setAccessible(true);
        Object enum5 = ((Field) term5549).get((Object) null);
        term1648 = newInstance(Class.forName("java.io.File"));
        setField(term1648, term1648.getClass(), "path", "MLqYREekMl");
        setField(term1648, term1648.getClass(), "status", enum5);
        setIntField(term1648, term1648.getClass(), "prefixLength", 304775596);
        setField(term1648, term1648.getClass(), "filePath", null);
        Class<? extends Object> term5703 = Class.forName((String) "java.io.File$PathStatus");
        Field term5702 = ((Class) term5703).getDeclaredField((String) "INVALID");
        ((Field) term5702).setAccessible(true);
        Object enum6 = ((Field) term5702).get((Object) null);
        term5533 = newInstance(Class.forName("java.io.File"));
        setField(term5533, term5533.getClass(), "path", "MLqYREekMl");
        setField(term5533, term5533.getClass(), "status", enum6);
        setIntField(term5533, term5533.getClass(), "prefixLength", 304775596);
        setField(term5533, term5533.getClass(), "filePath", null);
        Class<? extends Object> term5856 = Class.forName((String) "java.io.File$PathStatus");
        Field term5855 = ((Class) term5856).getDeclaredField((String) "INVALID");
        ((Field) term5855).setAccessible(true);
        Object enum7 = ((Field) term5855).get((Object) null);
        term5473 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        Object term5474 = newInstance(Class.forName("java.io.File"));
        setField(term5474, term5474.getClass(), "path", "MLqYREekMl");
        setField(term5474, term5474.getClass(), "status", enum7);
        setIntField(term5474, term5474.getClass(), "prefixLength", 304775596);
        setField(term5474, term5474.getClass(), "filePath", null);
        setField(term5473, term5473.getClass(), "file", term5474);
        setField(term5473, term5473.getClass(), "inputCharset", "UTF-8");
        setField(term5473, term5473.getClass(), "fileName", "MLqYREekMl");
        setBooleanField(term5473, term5473.getClass(), "isExternFile", false);
        setField(term5473, term5473.getClass(), "originalPath", null);
        setField(term5473, term5473.getClass(), "lineOffsets", null);
        setIntField(term5473, term5473.getClass(), "lastOffset", 0);
        setIntField(term5473, term5473.getClass(), "lastLine", 1);
        setField(term5473, term5473.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1648;
        Object retValue = callMethod(klass, "fromFile", argTypes, null, args);
        assertTrue(recursiveEquals(term1648, term5533));
        assertTrue(recursiveEquals(retValue, term5473));
    }

};


