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

public class StrBuilder_asReader_1278536149271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11845;
     Object term84272;
     Object term84210;

    public StrBuilder_asReader_1278536149271() {
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
        term84272 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term84273 = (char[]) newCharArray(32);
        setField(term84272, term84272.getClass(), "buffer", term84273);
        setIntField(term84272, term84272.getClass(), "size", -1274456137);
        setField(term84272, term84272.getClass(), "newLine", "TwfWVQGiIj");
        setField(term84272, term84272.getClass(), "nullText", "gUvcueTURF");
        term84210 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderReader"));
        Object term84213 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term84214 = (char[]) newCharArray(32);
        setIntField(term84210, term84210.getClass(), "pos", 0);
        setIntField(term84210, term84210.getClass(), "mark", 0);
        setField(term84213, term84213.getClass(), "buffer", term84214);
        setIntField(term84213, term84213.getClass(), "size", -1274456137);
        setField(term84213, term84213.getClass(), "newLine", "TwfWVQGiIj");
        setField(term84213, term84213.getClass(), "nullText", "gUvcueTURF");
        setField(term84210, term84210.getClass(), "this$0", term84213);
        setField(term84210, term84210.getClass(), "lock", term84210);
        setField(term84210, term84210.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asReader", argTypes, term11845, args);
        assertTrue(recursiveEquals(term11845, term84272));
        assertTrue(recursiveEquals(retValue, term84210));
    }

};


