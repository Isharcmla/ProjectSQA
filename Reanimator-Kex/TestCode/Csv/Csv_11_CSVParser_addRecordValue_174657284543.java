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
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class CSVParser_addRecordValue_174657284543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186850;
     Object term187181;

    public CSVParser_addRecordValue_174657284543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term182298 = (char[]) newCharArray(0);
        StringBuilder term186972 = new StringBuilder();
        ((StringBuilder) term186972).append(term182298);
        ArrayList term187132 = new ArrayList();
        term186850 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term186912 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term187042 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term186912, term186912.getClass(), "content", term186972);
        setField(term186850, term186850.getClass(), "reusableToken", term186912);
        setField(term187042, term187042.getClass(), "nullString", "");
        setField(term186850, term186850.getClass(), "format", term187042);
        setField(term186850, term186850.getClass(), "record", term187132);
        ArrayList term187185 = new ArrayList();
        ((ArrayList) term187185).add((Object)null);
        term187181 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term187182 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term187187 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term187188 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term187189 = (byte[]) newByteArray(16);
        setCharField(term187182, term187182.getClass(), "delimiter", (char) 0);
        setField(term187182, term187182.getClass(), "quoteChar", null);
        setField(term187182, term187182.getClass(), "quotePolicy", null);
        setField(term187182, term187182.getClass(), "commentStart", null);
        setField(term187182, term187182.getClass(), "escape", null);
        setBooleanField(term187182, term187182.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term187182, term187182.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term187182, term187182.getClass(), "ignoreEmptyLines", false);
        setField(term187182, term187182.getClass(), "recordSeparator", null);
        setField(term187182, term187182.getClass(), "nullString", "");
        setField(term187182, term187182.getClass(), "header", null);
        setBooleanField(term187182, term187182.getClass(), "skipHeaderRecord", false);
        setField(term187181, term187181.getClass(), "format", term187182);
        setField(term187181, term187181.getClass(), "headerMap", null);
        setField(term187181, term187181.getClass(), "lexer", null);
        setField(term187181, term187181.getClass(), "record", term187185);
        setLongField(term187181, term187181.getClass(), "recordNumber", 0L);
        setField(term187187, term187187.getClass(), "type", null);
        setField(term187188, term187188.getClass(), "value", term187189);
        setByteField(term187188, term187188.getClass(), "coder", (byte) 0);
        setIntField(term187188, term187188.getClass(), "count", 0);
        setField(term187187, term187187.getClass(), "content", term187188);
        setBooleanField(term187187, term187187.getClass(), "isReady", false);
        setField(term187181, term187181.getClass(), "reusableToken", term187187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addRecordValue", argTypes, term186850, args);
        assertTrue(recursiveEquals(term186850, term187181));
    }

};


