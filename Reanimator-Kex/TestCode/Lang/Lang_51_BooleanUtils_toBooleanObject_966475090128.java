package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Integer;

public class BooleanUtils_toBooleanObject_966475090128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13939;
     Object term13987;
     Object term14035;
     Object term14083;
     Object term14639;
     Object term14640;
     Object term14641;
     Object term14642;

    public BooleanUtils_toBooleanObject_966475090128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13939 = new Integer(1221843623);
        term13987 = new Integer(537395216);
        term14035 = new Integer(537395216);
        term14083 = new Integer(1221843623);
        term14639 = new Integer(1221843623);
        term14640 = new Integer(537395216);
        term14641 = new Integer(537395216);
        term14642 = new Integer(1221843623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = term13939;
        args[1] = term13987;
        args[2] = term14035;
        args[3] = term14083;
        Object retValue = callMethod(klass, "toBooleanObject", argTypes, null, args);
        assertTrue(recursiveEquals(term13939, term14639));
        assertTrue(recursiveEquals(term13987, term14640));
        assertTrue(recursiveEquals(term14035, term14641));
        assertTrue(recursiveEquals(term14083, term14642));
        assertTrue(recursiveEquals(retValue, null));
    }

};


