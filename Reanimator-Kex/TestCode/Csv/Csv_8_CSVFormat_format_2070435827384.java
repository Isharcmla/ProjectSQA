package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuffer;

public class CSVFormat_format_2070435827384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300637;
     Object term299854;

    public CSVFormat_format_2070435827384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term300689 = new Character((char) 27214);
        Character term300741 = new Character((char) 32);
        Character term300793 = new Character((char) 0);
        Class<? extends Object> term301031 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term301030 = ((Class) term301031).getDeclaredField((String) "NONE");
        ((Field) term301030).setAccessible(true);
        Object enum439 = ((Field) term301030).get((Object) null);
        term300637 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term300184 = (Object[]) newArray("java.lang.String", 0);
        setField(term300637, term300637.getClass(), "quoteChar", term300689);
        setCharField(term300637, term300637.getClass(), "delimiter", (char) 56287);
        setField(term300637, term300637.getClass(), "escape", term300741);
        setField(term300637, term300637.getClass(), "commentStart", term300793);
        setField(term300637, term300637.getClass(), "header", term300184);
        setField(term300637, term300637.getClass(), "quotePolicy", enum439);
        StringBuffer term300951 = new StringBuffer();
        Class<? extends Object> term301190 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term301189 = ((Class) term301190).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term301189).setAccessible(true);
        Object enum440 = ((Field) term301189).get((Object) null);
        term299854 = (Object[]) newArray("java.lang.String", 2);
        setElement(term299854, 0, term300951);
        setElement(term299854, 1, enum440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term299854;
        callMethod(klass, "format", argTypes, term300637, args);
    }

};


