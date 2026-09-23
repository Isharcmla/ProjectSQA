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

public class StrBuilder_asReader_1278536149270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11845;
     Object term81773;
     Object term81711;

    public StrBuilder_asReader_1278536149270() {
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
        term81773 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81774 = (char[]) newCharArray(32);
        setField(term81773, term81773.getClass(), "buffer", term81774);
        setIntField(term81773, term81773.getClass(), "size", -1274456137);
        setField(term81773, term81773.getClass(), "newLine", "TwfWVQGiIj");
        setField(term81773, term81773.getClass(), "nullText", "gUvcueTURF");
        term81711 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderReader"));
        Object term81714 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81715 = (char[]) newCharArray(32);
        setIntField(term81711, term81711.getClass(), "pos", 0);
        setIntField(term81711, term81711.getClass(), "mark", 0);
        setField(term81714, term81714.getClass(), "buffer", term81715);
        setIntField(term81714, term81714.getClass(), "size", -1274456137);
        setField(term81714, term81714.getClass(), "newLine", "TwfWVQGiIj");
        setField(term81714, term81714.getClass(), "nullText", "gUvcueTURF");
        setField(term81711, term81711.getClass(), "this$0", term81714);
        setField(term81711, term81711.getClass(), "lock", term81711);
        setField(term81711, term81711.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asReader", argTypes, term11845, args);
        assertTrue(recursiveEquals(term11845, term81773));
        assertTrue(recursiveEquals(retValue, term81711));
    }

};


