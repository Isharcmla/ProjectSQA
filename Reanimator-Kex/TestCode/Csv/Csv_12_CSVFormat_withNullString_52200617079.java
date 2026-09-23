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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withNullString_52200617079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11487;
     Object term43879;
     Object term43574;

    public CSVFormat_withNullString_52200617079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11489 = new Character('V');
        Class<? extends Object> term43904 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43903 = ((Class) term43904).getDeclaredField((String) "NONE");
        ((Field) term43903).setAccessible(true);
        Object enum112 = ((Field) term43903).get((Object) null);
        Character term11499 = new Character('c');
        Character term11501 = new Character('I');
        term11487 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11530 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term11487, term11487.getClass(), "delimiter", 'o');
        setField(term11487, term11487.getClass(), "quoteCharacter", term11489);
        setField(term11487, term11487.getClass(), "quoteMode", enum112);
        setField(term11487, term11487.getClass(), "commentMarker", term11499);
        setField(term11487, term11487.getClass(), "escapeCharacter", term11501);
        setBooleanField(term11487, term11487.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term11487, term11487.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term11487, term11487.getClass(), "ignoreEmptyLines", false);
        setField(term11487, term11487.getClass(), "recordSeparator", "BjugTaMcxJ");
        setField(term11487, term11487.getClass(), "nullString", "vGiuZVPJNH");
        setElement(term11530, 0, "tlzpzIjMib");
        setElement(term11530, 1, "AZdLeSugwv");
        setElement(term11530, 2, "RMsXuyzKJV");
        setElement(term11530, 3, "FwPbDZcHmB");
        setElement(term11530, 4, "hOncybyCAH");
        setField(term11487, term11487.getClass(), "header", term11530);
        setBooleanField(term11487, term11487.getClass(), "skipHeaderRecord", true);
        Character term43880 = new Character('V');
        Class<? extends Object> term44163 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44162 = ((Class) term44163).getDeclaredField((String) "NONE");
        ((Field) term44162).setAccessible(true);
        Object enum113 = ((Field) term44162).get((Object) null);
        Character term43884 = new Character('c');
        Character term43885 = new Character('I');
        term43879 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term43890 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term43879, term43879.getClass(), "delimiter", 'o');
        setField(term43879, term43879.getClass(), "quoteCharacter", term43880);
        setField(term43879, term43879.getClass(), "quoteMode", enum113);
        setField(term43879, term43879.getClass(), "commentMarker", term43884);
        setField(term43879, term43879.getClass(), "escapeCharacter", term43885);
        setBooleanField(term43879, term43879.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term43879, term43879.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term43879, term43879.getClass(), "ignoreEmptyLines", false);
        setField(term43879, term43879.getClass(), "recordSeparator", "BjugTaMcxJ");
        setField(term43879, term43879.getClass(), "nullString", "vGiuZVPJNH");
        setElement(term43890, 0, "tlzpzIjMib");
        setElement(term43890, 1, "AZdLeSugwv");
        setElement(term43890, 2, "RMsXuyzKJV");
        setElement(term43890, 3, "FwPbDZcHmB");
        setElement(term43890, 4, "hOncybyCAH");
        setField(term43879, term43879.getClass(), "header", term43890);
        setBooleanField(term43879, term43879.getClass(), "skipHeaderRecord", true);
        Character term43576 = new Character('V');
        Class<? extends Object> term44422 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44421 = ((Class) term44422).getDeclaredField((String) "NONE");
        ((Field) term44421).setAccessible(true);
        Object enum114 = ((Field) term44421).get((Object) null);
        Character term43586 = new Character('c');
        Character term43588 = new Character('I');
        term43574 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term43617 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term43574, term43574.getClass(), "delimiter", 'o');
        setField(term43574, term43574.getClass(), "quoteCharacter", term43576);
        setField(term43574, term43574.getClass(), "quoteMode", enum114);
        setField(term43574, term43574.getClass(), "commentMarker", term43586);
        setField(term43574, term43574.getClass(), "escapeCharacter", term43588);
        setBooleanField(term43574, term43574.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term43574, term43574.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term43574, term43574.getClass(), "ignoreEmptyLines", false);
        setField(term43574, term43574.getClass(), "recordSeparator", "BjugTaMcxJ");
        setField(term43574, term43574.getClass(), "nullString", "QduALnDSVo");
        setElement(term43617, 0, "tlzpzIjMib");
        setElement(term43617, 1, "AZdLeSugwv");
        setElement(term43617, 2, "RMsXuyzKJV");
        setElement(term43617, 3, "FwPbDZcHmB");
        setElement(term43617, 4, "hOncybyCAH");
        setField(term43574, term43574.getClass(), "header", term43617);
        setBooleanField(term43574, term43574.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QduALnDSVo";
        Object retValue = callMethod(klass, "withNullString", argTypes, term11487, args);
        assertTrue(recursiveEquals(term11487, term43879));
        assertTrue(recursiveEquals(retValue, term43574));
    }

};


