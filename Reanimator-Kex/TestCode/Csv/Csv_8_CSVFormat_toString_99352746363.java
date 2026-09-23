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

public class CSVFormat_toString_99352746363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6403;
     Object term27220;

    public CSVFormat_toString_99352746363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6405 = new Character('z');
        Class<? extends Object> term27235 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term27234 = ((Class) term27235).getDeclaredField((String) "NONE");
        ((Field) term27234).setAccessible(true);
        Object enum79 = ((Field) term27234).get((Object) null);
        Character term6415 = new Character('Y');
        Character term6417 = new Character('Y');
        term6403 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6445 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term6403, term6403.getClass(), "delimiter", 'S');
        setField(term6403, term6403.getClass(), "quoteChar", term6405);
        setField(term6403, term6403.getClass(), "quotePolicy", enum79);
        setField(term6403, term6403.getClass(), "commentStart", term6415);
        setField(term6403, term6403.getClass(), "escape", term6417);
        setBooleanField(term6403, term6403.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term6403, term6403.getClass(), "ignoreEmptyLines", false);
        setField(term6403, term6403.getClass(), "recordSeparator", "MvRIxilFMJ");
        setField(term6403, term6403.getClass(), "nullString", "iNwOJRBEjp");
        setElement(term6445, 0, "XylxrMBraH");
        setField(term6403, term6403.getClass(), "header", term6445);
        setBooleanField(term6403, term6403.getClass(), "skipHeaderRecord", true);
        Character term27221 = new Character('z');
        Class<? extends Object> term27424 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term27423 = ((Class) term27424).getDeclaredField((String) "NONE");
        ((Field) term27423).setAccessible(true);
        Object enum80 = ((Field) term27423).get((Object) null);
        Character term27225 = new Character('Y');
        Character term27226 = new Character('Y');
        term27220 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term27231 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term27220, term27220.getClass(), "delimiter", 'S');
        setField(term27220, term27220.getClass(), "quoteChar", term27221);
        setField(term27220, term27220.getClass(), "quotePolicy", enum80);
        setField(term27220, term27220.getClass(), "commentStart", term27225);
        setField(term27220, term27220.getClass(), "escape", term27226);
        setBooleanField(term27220, term27220.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term27220, term27220.getClass(), "ignoreEmptyLines", false);
        setField(term27220, term27220.getClass(), "recordSeparator", "MvRIxilFMJ");
        setField(term27220, term27220.getClass(), "nullString", "iNwOJRBEjp");
        setElement(term27231, 0, "XylxrMBraH");
        setField(term27220, term27220.getClass(), "header", term27231);
        setBooleanField(term27220, term27220.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term6403, args);
        assertTrue(recursiveEquals(term6403, term27220));
        assertTrue(recursiveEquals(retValue, "Delimiter=<S> Escape=<Y> QuoteChar=<z> CommentStart=<Y> NullString=<iNwOJRBEjp> RecordSeparator=<MvRIxilFMJ> SkipHeaderRecord:true Header:[XylxrMBraH]"));
    }

};


