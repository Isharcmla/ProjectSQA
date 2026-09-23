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

public class StrBuilder_asReader_1278536149332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14665;
     Object term96972;
     Object term96910;

    public StrBuilder_asReader_1278536149332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14665 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term14666 = (char[]) newCharArray(32);
        setField(term14665, term14665.getClass(), "buffer", term14666);
        setIntField(term14665, term14665.getClass(), "size", 318591690);
        setField(term14665, term14665.getClass(), "newLine", "FjOiNAfBOc");
        setField(term14665, term14665.getClass(), "nullText", "iCCsaLHohG");
        term96972 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term96973 = (char[]) newCharArray(32);
        setField(term96972, term96972.getClass(), "buffer", term96973);
        setIntField(term96972, term96972.getClass(), "size", 318591690);
        setField(term96972, term96972.getClass(), "newLine", "FjOiNAfBOc");
        setField(term96972, term96972.getClass(), "nullText", "iCCsaLHohG");
        term96910 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderReader"));
        Object term96913 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term96914 = (char[]) newCharArray(32);
        setIntField(term96910, term96910.getClass(), "pos", 0);
        setIntField(term96910, term96910.getClass(), "mark", 0);
        setField(term96913, term96913.getClass(), "buffer", term96914);
        setIntField(term96913, term96913.getClass(), "size", 318591690);
        setField(term96913, term96913.getClass(), "newLine", "FjOiNAfBOc");
        setField(term96913, term96913.getClass(), "nullText", "iCCsaLHohG");
        setField(term96910, term96910.getClass(), "this$0", term96913);
        setField(term96910, term96910.getClass(), "lock", term96910);
        setField(term96910, term96910.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asReader", argTypes, term14665, args);
        assertTrue(recursiveEquals(term14665, term96972));
        assertTrue(recursiveEquals(retValue, term96910));
    }

};


