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

public class StrBuilder_asWriter_2102558325272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11956;
     Object term84494;
     Object term84434;

    public StrBuilder_asWriter_2102558325272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11956 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11957 = (char[]) newCharArray(32);
        setField(term11956, term11956.getClass(), "buffer", term11957);
        setIntField(term11956, term11956.getClass(), "size", 1041916673);
        setField(term11956, term11956.getClass(), "newLine", "EwQBhZjCIT");
        setField(term11956, term11956.getClass(), "nullText", "aSkmSwTnEw");
        term84494 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term84495 = (char[]) newCharArray(32);
        setField(term84494, term84494.getClass(), "buffer", term84495);
        setIntField(term84494, term84494.getClass(), "size", 1041916673);
        setField(term84494, term84494.getClass(), "newLine", "EwQBhZjCIT");
        setField(term84494, term84494.getClass(), "nullText", "aSkmSwTnEw");
        term84434 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderWriter"));
        Object term84435 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term84436 = (char[]) newCharArray(32);
        setField(term84435, term84435.getClass(), "buffer", term84436);
        setIntField(term84435, term84435.getClass(), "size", 1041916673);
        setField(term84435, term84435.getClass(), "newLine", "EwQBhZjCIT");
        setField(term84435, term84435.getClass(), "nullText", "aSkmSwTnEw");
        setField(term84434, term84434.getClass(), "this$0", term84435);
        setField(term84434, term84434.getClass(), "writeBuffer", null);
        setField(term84434, term84434.getClass(), "lock", term84434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asWriter", argTypes, term11956, args);
        assertTrue(recursiveEquals(term11956, term84494));
        assertTrue(recursiveEquals(retValue, term84434));
    }

};


