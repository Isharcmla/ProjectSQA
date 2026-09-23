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

public class StrBuilder_replaceImpl_404695259243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8741;
     Object term8812;
     Object term8814;
     Object term8816;
     Object term77226;
     Object term77152;

    public StrBuilder_replaceImpl_404695259243() {
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
        term77226 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term77227 = (char[]) newCharArray(32);
        setField(term77226, term77226.getClass(), "buffer", term77227);
        setIntField(term77226, term77226.getClass(), "size", -341152642);
        setField(term77226, term77226.getClass(), "newLine", "XYtryyobou");
        setField(term77226, term77226.getClass(), "nullText", "OYbzXylRWW");
        term77152 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term77153 = (char[]) newCharArray(32);
        setField(term77152, term77152.getClass(), "buffer", term77153);
        setIntField(term77152, term77152.getClass(), "size", -341152642);
        setField(term77152, term77152.getClass(), "newLine", "XYtryyobou");
        setField(term77152, term77152.getClass(), "nullText", "OYbzXylRWW");
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
        assertTrue(recursiveEquals(term8741, term77226));
        assertTrue(recursiveEquals(term8812, -2015854073));
        assertTrue(recursiveEquals(term8814, 538259104));
        assertTrue(recursiveEquals(term8816, 96566506));
        assertTrue(recursiveEquals(retValue, term77152));
    }

};


