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

public class StrBuilder_equals_461800784335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15109;
     Object term15168;
     Object term97819;
     Object term97825;

    public StrBuilder_equals_461800784335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15109 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term15110 = (char[]) newCharArray(32);
        setField(term15109, term15109.getClass(), "buffer", term15110);
        setIntField(term15109, term15109.getClass(), "size", 548228925);
        setField(term15109, term15109.getClass(), "newLine", "oPxuZbkYio");
        setField(term15109, term15109.getClass(), "nullText", "vKitydDVnM");
        term15168 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term15169 = (char[]) newCharArray(32);
        setField(term15168, term15168.getClass(), "buffer", term15169);
        setIntField(term15168, term15168.getClass(), "size", -749861210);
        setField(term15168, term15168.getClass(), "newLine", "urCiQnUFBM");
        setField(term15168, term15168.getClass(), "nullText", "EKjQdtKxAM");
        term97819 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term97820 = (char[]) newCharArray(32);
        setField(term97819, term97819.getClass(), "buffer", term97820);
        setIntField(term97819, term97819.getClass(), "size", 548228925);
        setField(term97819, term97819.getClass(), "newLine", "oPxuZbkYio");
        setField(term97819, term97819.getClass(), "nullText", "vKitydDVnM");
        term97825 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term97826 = (char[]) newCharArray(32);
        setField(term97825, term97825.getClass(), "buffer", term97826);
        setIntField(term97825, term97825.getClass(), "size", -749861210);
        setField(term97825, term97825.getClass(), "newLine", "urCiQnUFBM");
        setField(term97825, term97825.getClass(), "nullText", "EKjQdtKxAM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term15168;
        Object retValue = callMethod(klass, "equals", argTypes, term15109, args);
        assertTrue(recursiveEquals(term15109, term97819));
        assertTrue(recursiveEquals(term15168, term97825));
        assertTrue(recursiveEquals(retValue, false));
    }

};


