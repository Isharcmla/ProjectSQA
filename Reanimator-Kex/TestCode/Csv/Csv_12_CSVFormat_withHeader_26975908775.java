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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withHeader_26975908775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9992;
     Object term10109;

    public CSVFormat_withHeader_26975908775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9994 = new Character('Y');
        Class<? extends Object> term40195 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term40194 = ((Class) term40195).getDeclaredField((String) "NONE");
        ((Field) term40194).setAccessible(true);
        Object enum102 = ((Field) term40194).get((Object) null);
        Character term10004 = new Character('V');
        Character term10006 = new Character('z');
        term9992 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10035 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term9992, term9992.getClass(), "delimiter", 'z');
        setField(term9992, term9992.getClass(), "quoteCharacter", term9994);
        setField(term9992, term9992.getClass(), "quoteMode", enum102);
        setField(term9992, term9992.getClass(), "commentMarker", term10004);
        setField(term9992, term9992.getClass(), "escapeCharacter", term10006);
        setBooleanField(term9992, term9992.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term9992, term9992.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term9992, term9992.getClass(), "ignoreEmptyLines", false);
        setField(term9992, term9992.getClass(), "recordSeparator", "xtftXXMbem");
        setField(term9992, term9992.getClass(), "nullString", "cudZvLMQon");
        setElement(term10035, 0, "lihXWlGDxk");
        setElement(term10035, 1, "JmcmxoGhIK");
        setElement(term10035, 2, "jXzmYyrnnT");
        setElement(term10035, 3, "igCAtimmYB");
        setElement(term10035, 4, "DyiXbeYIaN");
        setElement(term10035, 5, "VGizxZnyHX");
        setField(term9992, term9992.getClass(), "header", term10035);
        setBooleanField(term9992, term9992.getClass(), "skipHeaderRecord", false);
        term10109 = (Object[]) newArray("java.lang.String", 6);
        setElement(term10109, 0, "kVEZMHmRtR");
        setElement(term10109, 1, "ekxGuOYIwi");
        setElement(term10109, 2, "RbVQXSpxXy");
        setElement(term10109, 3, "YpJbIgJWWv");
        setElement(term10109, 4, "JppkknKVOw");
        setElement(term10109, 5, "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10109;
        try {
            callMethod(klass, "withHeader", argTypes, term9992, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


