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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuilder;

public class CSVParser_addRecordValue_174657191548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190792;

    public CSVParser_addRecordValue_174657191548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term189221 = (char[]) newCharArray(489);
        StringBuilder term190914 = new StringBuilder();
        ((StringBuilder) term190914).append(term189221);
        term190792 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term190854 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term190984 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term190854, term190854.getClass(), "content", term190914);
        setField(term190792, term190792.getClass(), "reusableToken", term190854);
        setBooleanField(term190984, term190984.getClass(), "trim", false);
        setField(term190792, term190792.getClass(), "format", term190984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "addRecordValue", argTypes, term190792, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


