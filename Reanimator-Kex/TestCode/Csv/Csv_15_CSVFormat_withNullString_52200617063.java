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

public class CSVFormat_withNullString_52200617063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27021;

    public CSVFormat_withNullString_52200617063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term27023 = new Character('I');
        Character term27026 = new Character('C');
        Character term27237 = new Character('K');
        Class<? extends Object> term27445 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term27444 = ((Class) term27445).getDeclaredField((String) "ALL");
        ((Field) term27444).setAccessible(true);
        Object enum60 = ((Field) term27444).get((Object) null);
        term27021 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term27028 = (Object[]) newArray("java.lang.String", 8);
        Object[] term27125 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term27021, term27021.getClass(), "allowMissingColumnNames", false);
        setField(term27021, term27021.getClass(), "commentMarker", term27023);
        setCharField(term27021, term27021.getClass(), "delimiter", 'q');
        setField(term27021, term27021.getClass(), "escapeCharacter", term27026);
        setElement(term27028, 0, "SrWMUlbtWV");
        setElement(term27028, 1, "VePIumgrrU");
        setElement(term27028, 2, "DPwIqlszZo");
        setElement(term27028, 3, "mNgDshwZNc");
        setElement(term27028, 4, "pDqgDbJoFw");
        setElement(term27028, 5, "iVOvTzOxwt");
        setElement(term27028, 6, "BjZQdecXvB");
        setElement(term27028, 7, "iUkOOQhEkw");
        setField(term27021, term27021.getClass(), "header", term27028);
        setElement(term27125, 0, "wmVoFoUVmU");
        setElement(term27125, 1, "lLiSiPCciB");
        setElement(term27125, 2, "PsMKIIEwdR");
        setElement(term27125, 3, "RbQmXqfXAT");
        setElement(term27125, 4, "fcCAsvfBbe");
        setElement(term27125, 5, "mUNcKUxghj");
        setElement(term27125, 6, "lnvLKbtveE");
        setElement(term27125, 7, "FfrrEhTHzQ");
        setField(term27021, term27021.getClass(), "headerComments", term27125);
        setBooleanField(term27021, term27021.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term27021, term27021.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term27021, term27021.getClass(), "ignoreSurroundingSpaces", false);
        setField(term27021, term27021.getClass(), "nullString", "LXnDNrMsqT");
        setField(term27021, term27021.getClass(), "quoteCharacter", term27237);
        setField(term27021, term27021.getClass(), "quoteMode", enum60);
        setField(term27021, term27021.getClass(), "recordSeparator", "ZLQamJFBmu");
        setBooleanField(term27021, term27021.getClass(), "skipHeaderRecord", true);
        setBooleanField(term27021, term27021.getClass(), "trailingDelimiter", false);
        setBooleanField(term27021, term27021.getClass(), "trim", true);
        setBooleanField(term27021, term27021.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZWcOCwKNvd";
        callMethod(klass, "withNullString", argTypes, term27021, args);
    }

};


