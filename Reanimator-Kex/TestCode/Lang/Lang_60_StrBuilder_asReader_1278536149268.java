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
import java.lang.Object;

public class StrBuilder_asReader_1278536149268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11845;
     Object term82668;
     Object term82606;

    public StrBuilder_asReader_1278536149268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11845 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11846 = (char[]) newCharArray(32);
        setField(term11845, term11845.getClass(), "buffer", term11846);
        setIntField(term11845, term11845.getClass(), "size", -1274456137);
        setField(term11845, term11845.getClass(), "newLine", "TwfWVQGiIj");
        setField(term11845, term11845.getClass(), "nullText", "gUvcueTURF");
        term82668 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term82669 = (char[]) newCharArray(32);
        setField(term82668, term82668.getClass(), "buffer", term82669);
        setIntField(term82668, term82668.getClass(), "size", -1274456137);
        setField(term82668, term82668.getClass(), "newLine", "TwfWVQGiIj");
        setField(term82668, term82668.getClass(), "nullText", "gUvcueTURF");
        term82606 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderReader"));
        Object term82609 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term82610 = (char[]) newCharArray(32);
        setIntField(term82606, term82606.getClass(), "pos", 0);
        setIntField(term82606, term82606.getClass(), "mark", 0);
        setField(term82609, term82609.getClass(), "buffer", term82610);
        setIntField(term82609, term82609.getClass(), "size", -1274456137);
        setField(term82609, term82609.getClass(), "newLine", "TwfWVQGiIj");
        setField(term82609, term82609.getClass(), "nullText", "gUvcueTURF");
        setField(term82606, term82606.getClass(), "this$0", term82609);
        setField(term82606, term82606.getClass(), "lock", term82606);
        setField(term82606, term82606.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asReader", argTypes, term11845, args);
        assertTrue(recursiveEquals(term11845, term82668));
        assertTrue(recursiveEquals(retValue, term82606));
    }

};


