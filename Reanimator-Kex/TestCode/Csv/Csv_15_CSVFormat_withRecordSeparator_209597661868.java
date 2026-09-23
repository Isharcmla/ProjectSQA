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

public class CSVFormat_withRecordSeparator_209597661868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29581;

    public CSVFormat_withRecordSeparator_209597661868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term29583 = new Character('R');
        Character term29586 = new Character('u');
        Character term29725 = new Character('O');
        Class<? extends Object> term29881 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term29880 = ((Class) term29881).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term29880).setAccessible(true);
        Object enum66 = ((Field) term29880).get((Object) null);
        term29581 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term29588 = (Object[]) newArray("java.lang.String", 1);
        Object[] term29601 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term29581, term29581.getClass(), "allowMissingColumnNames", true);
        setField(term29581, term29581.getClass(), "commentMarker", term29583);
        setCharField(term29581, term29581.getClass(), "delimiter", 't');
        setField(term29581, term29581.getClass(), "escapeCharacter", term29586);
        setElement(term29588, 0, "blSffTnsOv");
        setField(term29581, term29581.getClass(), "header", term29588);
        setElement(term29601, 0, "qbUMcIvEXH");
        setElement(term29601, 1, "TVxGTjeDcu");
        setElement(term29601, 2, "ABPtcyCzkR");
        setElement(term29601, 3, "QgHhxMyKvr");
        setElement(term29601, 4, "VGiXZZTWRO");
        setElement(term29601, 5, "MlPtwXnJOJ");
        setElement(term29601, 6, "DbfiyFeaTe");
        setElement(term29601, 7, "dQxXGBtDLZ");
        setElement(term29601, 8, "EgSgEFIyyN");
        setField(term29581, term29581.getClass(), "headerComments", term29601);
        setBooleanField(term29581, term29581.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term29581, term29581.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term29581, term29581.getClass(), "ignoreSurroundingSpaces", true);
        setField(term29581, term29581.getClass(), "nullString", "iAOFcXaLSf");
        setField(term29581, term29581.getClass(), "quoteCharacter", term29725);
        setField(term29581, term29581.getClass(), "quoteMode", enum66);
        setField(term29581, term29581.getClass(), "recordSeparator", "EHoNUaeyvT");
        setBooleanField(term29581, term29581.getClass(), "skipHeaderRecord", false);
        setBooleanField(term29581, term29581.getClass(), "trailingDelimiter", false);
        setBooleanField(term29581, term29581.getClass(), "trim", false);
        setBooleanField(term29581, term29581.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZwKmasCVIy";
        callMethod(klass, "withRecordSeparator", argTypes, term29581, args);
    }

};


