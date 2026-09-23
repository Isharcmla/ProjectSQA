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

public class FunctionType_setPrototype_1918602805463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320149;
     Object term320533;
     Object term321035;
     Object term321041;

    public FunctionType_setPrototype_1918602805463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term321045 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term321044 = ((Class) term321045).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term321044).setAccessible(true);
        Object enum584 = ((Field) term321044).get((Object) null);
        term320149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term320415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term320149, term320149.getClass(), "kind", enum584);
        setField(term320149, term320149.getClass(), "typeOfThis", null);
        setField(term320149, term320149.getClass(), "prototype", term320415);
        term320533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term320651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term320533, term320533.getClass(), "implicitPrototype", term320651);
        Class<? extends Object> term321345 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term321344 = ((Class) term321345).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term321344).setAccessible(true);
        Object enum585 = ((Field) term321344).get((Object) null);
        term321035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term321036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term321037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term321035, term321035.getClass(), "call", null);
        setField(term321036, term321036.getClass(), "ownerFunction", null);
        setField(term321036, term321036.getClass(), "className", null);
        setField(term321036, term321036.getClass(), "properties", null);
        setField(term321037, term321037.getClass(), "ownerFunction", null);
        setField(term321037, term321037.getClass(), "className", null);
        setField(term321037, term321037.getClass(), "properties", null);
        setField(term321037, term321037.getClass(), "implicitPrototype", null);
        setBooleanField(term321037, term321037.getClass(), "nativeType", false);
        setBooleanField(term321037, term321037.getClass(), "visited", false);
        setField(term321037, term321037.getClass(), "docInfo", null);
        setBooleanField(term321037, term321037.getClass(), "unknown", false);
        setBooleanField(term321037, term321037.getClass(), "resolved", false);
        setField(term321037, term321037.getClass(), "resolveResult", null);
        setField(term321037, term321037.getClass(), "registry", null);
        setField(term321036, term321036.getClass(), "implicitPrototype", term321037);
        setBooleanField(term321036, term321036.getClass(), "nativeType", false);
        setBooleanField(term321036, term321036.getClass(), "visited", false);
        setField(term321036, term321036.getClass(), "docInfo", null);
        setBooleanField(term321036, term321036.getClass(), "unknown", false);
        setBooleanField(term321036, term321036.getClass(), "resolved", false);
        setField(term321036, term321036.getClass(), "resolveResult", null);
        setField(term321036, term321036.getClass(), "registry", null);
        setField(term321035, term321035.getClass(), "prototype", term321036);
        setField(term321035, term321035.getClass(), "kind", enum585);
        setField(term321035, term321035.getClass(), "typeOfThis", null);
        setField(term321035, term321035.getClass(), "source", null);
        setField(term321035, term321035.getClass(), "implementedInterfaces", null);
        setField(term321035, term321035.getClass(), "subTypes", null);
        setField(term321035, term321035.getClass(), "templateTypeName", null);
        setField(term321035, term321035.getClass(), "className", null);
        setField(term321035, term321035.getClass(), "properties", null);
        setField(term321035, term321035.getClass(), "implicitPrototype", null);
        setBooleanField(term321035, term321035.getClass(), "nativeType", false);
        setBooleanField(term321035, term321035.getClass(), "visited", false);
        setField(term321035, term321035.getClass(), "docInfo", null);
        setBooleanField(term321035, term321035.getClass(), "unknown", false);
        setBooleanField(term321035, term321035.getClass(), "resolved", false);
        setField(term321035, term321035.getClass(), "resolveResult", null);
        setField(term321035, term321035.getClass(), "registry", null);
        term321041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term321042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term321041, term321041.getClass(), "ownerFunction", null);
        setField(term321041, term321041.getClass(), "className", null);
        setField(term321041, term321041.getClass(), "properties", null);
        setField(term321042, term321042.getClass(), "ownerFunction", null);
        setField(term321042, term321042.getClass(), "className", null);
        setField(term321042, term321042.getClass(), "properties", null);
        setField(term321042, term321042.getClass(), "implicitPrototype", null);
        setBooleanField(term321042, term321042.getClass(), "nativeType", false);
        setBooleanField(term321042, term321042.getClass(), "visited", false);
        setField(term321042, term321042.getClass(), "docInfo", null);
        setBooleanField(term321042, term321042.getClass(), "unknown", false);
        setBooleanField(term321042, term321042.getClass(), "resolved", false);
        setField(term321042, term321042.getClass(), "resolveResult", null);
        setField(term321042, term321042.getClass(), "registry", null);
        setField(term321041, term321041.getClass(), "implicitPrototype", term321042);
        setBooleanField(term321041, term321041.getClass(), "nativeType", false);
        setBooleanField(term321041, term321041.getClass(), "visited", false);
        setField(term321041, term321041.getClass(), "docInfo", null);
        setBooleanField(term321041, term321041.getClass(), "unknown", false);
        setBooleanField(term321041, term321041.getClass(), "resolved", false);
        setField(term321041, term321041.getClass(), "resolveResult", null);
        setField(term321041, term321041.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term320533;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term320149, args);
        assertTrue(recursiveEquals(term320149, term321035));
        assertTrue(recursiveEquals(term320533, term321041));
        assertTrue(recursiveEquals(retValue, true));
    }

};


