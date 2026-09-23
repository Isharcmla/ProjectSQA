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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withRecordSeparator_2095976618139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28372;
     Object term107765;
     Object term107188;

    public CSVFormat_withRecordSeparator_2095976618139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term28374 = new Character('X');
        Character term28377 = new Character('l');
        Character term28528 = new Character('x');
        Class<? extends Object> term107923 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term107922 = ((Class) term107923).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term107922).setAccessible(true);
        Object enum219 = ((Field) term107922).get((Object) null);
        term28372 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28379 = (Object[]) newArray("java.lang.String", 5);
        Object[] term28440 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term28372, term28372.getClass(), "allowMissingColumnNames", false);
        setField(term28372, term28372.getClass(), "commentMarker", term28374);
        setCharField(term28372, term28372.getClass(), "delimiter", 'f');
        setField(term28372, term28372.getClass(), "escapeCharacter", term28377);
        setElement(term28379, 0, "GSOWFHMlbF");
        setElement(term28379, 1, "vpZIqpFbKM");
        setElement(term28379, 2, "dAbwpJCDif");
        setElement(term28379, 3, "ATSXJPySio");
        setElement(term28379, 4, "XZkOUcbfFg");
        setField(term28372, term28372.getClass(), "header", term28379);
        setElement(term28440, 0, "TGiJfagfky");
        setElement(term28440, 1, "BJklinBmhN");
        setElement(term28440, 2, "IOddzvEWcl");
        setElement(term28440, 3, "bIrtpkYJWT");
        setElement(term28440, 4, "VuLLXpvPpZ");
        setElement(term28440, 5, "UEdzEKEEEV");
        setField(term28372, term28372.getClass(), "headerComments", term28440);
        setBooleanField(term28372, term28372.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term28372, term28372.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term28372, term28372.getClass(), "ignoreSurroundingSpaces", true);
        setField(term28372, term28372.getClass(), "nullString", "BcENaQFYSd");
        setField(term28372, term28372.getClass(), "quoteCharacter", term28528);
        setField(term28372, term28372.getClass(), "quoteMode", enum219);
        setField(term28372, term28372.getClass(), "recordSeparator", "POPYycoDBy");
        setBooleanField(term28372, term28372.getClass(), "skipHeaderRecord", true);
        setBooleanField(term28372, term28372.getClass(), "trailingDelimiter", false);
        setBooleanField(term28372, term28372.getClass(), "trim", true);
        Character term107766 = new Character('X');
        Character term107767 = new Character('l');
        Character term107794 = new Character('x');
        Class<? extends Object> term108263 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term108262 = ((Class) term108263).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term108262).setAccessible(true);
        Object enum220 = ((Field) term108262).get((Object) null);
        term107765 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term107768 = (Object[]) newArray("java.lang.String", 5);
        Object[] term107779 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term107765, term107765.getClass(), "allowMissingColumnNames", false);
        setField(term107765, term107765.getClass(), "commentMarker", term107766);
        setCharField(term107765, term107765.getClass(), "delimiter", 'f');
        setField(term107765, term107765.getClass(), "escapeCharacter", term107767);
        setElement(term107768, 0, "GSOWFHMlbF");
        setElement(term107768, 1, "vpZIqpFbKM");
        setElement(term107768, 2, "dAbwpJCDif");
        setElement(term107768, 3, "ATSXJPySio");
        setElement(term107768, 4, "XZkOUcbfFg");
        setField(term107765, term107765.getClass(), "header", term107768);
        setElement(term107779, 0, "TGiJfagfky");
        setElement(term107779, 1, "BJklinBmhN");
        setElement(term107779, 2, "IOddzvEWcl");
        setElement(term107779, 3, "bIrtpkYJWT");
        setElement(term107779, 4, "VuLLXpvPpZ");
        setElement(term107779, 5, "UEdzEKEEEV");
        setField(term107765, term107765.getClass(), "headerComments", term107779);
        setBooleanField(term107765, term107765.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term107765, term107765.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term107765, term107765.getClass(), "ignoreSurroundingSpaces", true);
        setField(term107765, term107765.getClass(), "nullString", "BcENaQFYSd");
        setField(term107765, term107765.getClass(), "quoteCharacter", term107794);
        setField(term107765, term107765.getClass(), "quoteMode", enum220);
        setField(term107765, term107765.getClass(), "recordSeparator", "POPYycoDBy");
        setBooleanField(term107765, term107765.getClass(), "skipHeaderRecord", true);
        setBooleanField(term107765, term107765.getClass(), "trailingDelimiter", false);
        setBooleanField(term107765, term107765.getClass(), "trim", true);
        Character term107190 = new Character('X');
        Character term107193 = new Character('l');
        Character term107344 = new Character('x');
        Class<? extends Object> term108603 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term108602 = ((Class) term108603).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term108602).setAccessible(true);
        Object enum221 = ((Field) term108602).get((Object) null);
        term107188 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term107195 = (Object[]) newArray("java.lang.String", 5);
        Object[] term107256 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term107188, term107188.getClass(), "allowMissingColumnNames", false);
        setField(term107188, term107188.getClass(), "commentMarker", term107190);
        setCharField(term107188, term107188.getClass(), "delimiter", 'f');
        setField(term107188, term107188.getClass(), "escapeCharacter", term107193);
        setElement(term107195, 0, "GSOWFHMlbF");
        setElement(term107195, 1, "vpZIqpFbKM");
        setElement(term107195, 2, "dAbwpJCDif");
        setElement(term107195, 3, "ATSXJPySio");
        setElement(term107195, 4, "XZkOUcbfFg");
        setField(term107188, term107188.getClass(), "header", term107195);
        setElement(term107256, 0, "TGiJfagfky");
        setElement(term107256, 1, "BJklinBmhN");
        setElement(term107256, 2, "IOddzvEWcl");
        setElement(term107256, 3, "bIrtpkYJWT");
        setElement(term107256, 4, "VuLLXpvPpZ");
        setElement(term107256, 5, "UEdzEKEEEV");
        setField(term107188, term107188.getClass(), "headerComments", term107256);
        setBooleanField(term107188, term107188.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term107188, term107188.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term107188, term107188.getClass(), "ignoreSurroundingSpaces", true);
        setField(term107188, term107188.getClass(), "nullString", "BcENaQFYSd");
        setField(term107188, term107188.getClass(), "quoteCharacter", term107344);
        setField(term107188, term107188.getClass(), "quoteMode", enum221);
        setField(term107188, term107188.getClass(), "recordSeparator", "LuWMOXdAPA");
        setBooleanField(term107188, term107188.getClass(), "skipHeaderRecord", true);
        setBooleanField(term107188, term107188.getClass(), "trailingDelimiter", false);
        setBooleanField(term107188, term107188.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LuWMOXdAPA";
        Object retValue = callMethod(klass, "withRecordSeparator", argTypes, term28372, args);
        assertTrue(recursiveEquals(term28372, term107765));
        assertTrue(recursiveEquals(retValue, term107188));
    }

};


