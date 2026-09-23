package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Integer;

public class StrBuilder_replaceImpl_404695259242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8741;
     Object term8812;
     Object term8814;
     Object term8816;
     Object term75592;
     Object term75518;

    public StrBuilder_replaceImpl_404695259242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8741 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8742 = (char[]) newCharArray(32);
        setField(term8741, term8741.getClass(), "buffer", term8742);
        setIntField(term8741, term8741.getClass(), "size", -341152642);
        setField(term8741, term8741.getClass(), "newLine", "XYtryyobou");
        setField(term8741, term8741.getClass(), "nullText", "OYbzXylRWW");
        term8812 = new Integer(-2015854073);
        term8814 = new Integer(538259104);
        term8816 = new Integer(96566506);
        term75592 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term75593 = (char[]) newCharArray(32);
        setField(term75592, term75592.getClass(), "buffer", term75593);
        setIntField(term75592, term75592.getClass(), "size", -341152642);
        setField(term75592, term75592.getClass(), "newLine", "XYtryyobou");
        setField(term75592, term75592.getClass(), "nullText", "OYbzXylRWW");
        term75518 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term75519 = (char[]) newCharArray(32);
        setField(term75518, term75518.getClass(), "buffer", term75519);
        setIntField(term75518, term75518.getClass(), "size", -341152642);
        setField(term75518, term75518.getClass(), "newLine", "XYtryyobou");
        setField(term75518, term75518.getClass(), "nullText", "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = "DSNsTGYXDF";
        args[2] = term8812;
        args[3] = term8814;
        args[4] = term8816;
        Object retValue = callMethod(klass, "replaceImpl", argTypes, term8741, args);
        assertTrue(recursiveEquals(term8741, term75592));
        assertTrue(recursiveEquals(term8812, -2015854073));
        assertTrue(recursiveEquals(term8814, 538259104));
        assertTrue(recursiveEquals(term8816, 96566506));
        assertTrue(recursiveEquals(retValue, term75518));
    }

};


