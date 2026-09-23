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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191277;
     Object term191467;

    public TypeValidator_getReadableJSTypeName_850599436412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191277 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term191381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term190826 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term191381, term191381.getClass(), "nativeTypes", term190826);
        setField(term191277, term191277.getClass(), "typeRegistry", term191381);
        term191467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term191553 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term191467, term191467.getClass(), "type", 33);
        setField(term191553, term191553.getClass(), "jsType", null);
        setField(term191467, term191467.getClass(), "first", term191553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term191467;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term191277, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


