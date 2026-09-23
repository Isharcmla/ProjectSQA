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

public class StrBuilder_asWriter_2102558325333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14776;
     Object term97194;
     Object term97134;

    public StrBuilder_asWriter_2102558325333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14776 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term14777 = (char[]) newCharArray(32);
        setField(term14776, term14776.getClass(), "buffer", term14777);
        setIntField(term14776, term14776.getClass(), "size", -165587447);
        setField(term14776, term14776.getClass(), "newLine", "NJhGgctbdj");
        setField(term14776, term14776.getClass(), "nullText", "MYWYUeLGOp");
        term97194 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term97195 = (char[]) newCharArray(32);
        setField(term97194, term97194.getClass(), "buffer", term97195);
        setIntField(term97194, term97194.getClass(), "size", -165587447);
        setField(term97194, term97194.getClass(), "newLine", "NJhGgctbdj");
        setField(term97194, term97194.getClass(), "nullText", "MYWYUeLGOp");
        term97134 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter"));
        Object term97135 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term97136 = (char[]) newCharArray(32);
        setField(term97135, term97135.getClass(), "buffer", term97136);
        setIntField(term97135, term97135.getClass(), "size", -165587447);
        setField(term97135, term97135.getClass(), "newLine", "NJhGgctbdj");
        setField(term97135, term97135.getClass(), "nullText", "MYWYUeLGOp");
        setField(term97134, term97134.getClass(), "this$0", term97135);
        setField(term97134, term97134.getClass(), "writeBuffer", null);
        setField(term97134, term97134.getClass(), "lock", term97134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asWriter", argTypes, term14776, args);
        assertTrue(recursiveEquals(term14776, term97194));
        assertTrue(recursiveEquals(retValue, term97134));
    }

};


