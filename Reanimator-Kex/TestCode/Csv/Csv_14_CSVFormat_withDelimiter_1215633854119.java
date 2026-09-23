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

public class CSVFormat_withDelimiter_1215633854119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19234;
     Object term19463;
     Object term78038;
     Object term77324;

    public CSVFormat_withDelimiter_1215633854119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term19236 = new Character('d');
        Character term19239 = new Character('j');
        Character term19438 = new Character('I');
        Class<? extends Object> term78242 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term78241 = ((Class) term78242).getDeclaredField((String) "NONE");
        ((Field) term78241).setAccessible(true);
        Object enum157 = ((Field) term78241).get((Object) null);
        term19234 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term19241 = (Object[]) newArray("java.lang.String", 9);
        Object[] term19350 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term19234, term19234.getClass(), "allowMissingColumnNames", false);
        setField(term19234, term19234.getClass(), "commentMarker", term19236);
        setCharField(term19234, term19234.getClass(), "delimiter", 'z');
        setField(term19234, term19234.getClass(), "escapeCharacter", term19239);
        setElement(term19241, 0, "sHMXNUzNeM");
        setElement(term19241, 1, "gPzGDOEPPw");
        setElement(term19241, 2, "rwKoAngzCu");
        setElement(term19241, 3, "VUkRVwROTl");
        setElement(term19241, 4, "UDlkdccCRn");
        setElement(term19241, 5, "McpzErOcYb");
        setElement(term19241, 6, "jqrVEUvYEz");
        setElement(term19241, 7, "QITgiBrmfj");
        setElement(term19241, 8, "pXxkiXgQnq");
        setField(term19234, term19234.getClass(), "header", term19241);
        setElement(term19350, 0, "tKmrUDURku");
        setElement(term19350, 1, "JeZbrwZmsP");
        setElement(term19350, 2, "bxyfeicqrK");
        setElement(term19350, 3, "vBnWPlsZMk");
        setElement(term19350, 4, "fIZsWucfXz");
        setElement(term19350, 5, "IApvtmfhnq");
        setField(term19234, term19234.getClass(), "headerComments", term19350);
        setBooleanField(term19234, term19234.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term19234, term19234.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term19234, term19234.getClass(), "ignoreSurroundingSpaces", true);
        setField(term19234, term19234.getClass(), "nullString", "VSaNnhMpRc");
        setField(term19234, term19234.getClass(), "quoteCharacter", term19438);
        setField(term19234, term19234.getClass(), "quoteMode", enum157);
        setField(term19234, term19234.getClass(), "recordSeparator", "QNjNTLlUaV");
        setBooleanField(term19234, term19234.getClass(), "skipHeaderRecord", true);
        setBooleanField(term19234, term19234.getClass(), "trailingDelimiter", true);
        setBooleanField(term19234, term19234.getClass(), "trim", false);
        term19463 = new Character('f');
        Character term78039 = new Character('d');
        Character term78040 = new Character('j');
        Character term78075 = new Character('I');
        Class<? extends Object> term78591 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term78590 = ((Class) term78591).getDeclaredField((String) "NONE");
        ((Field) term78590).setAccessible(true);
        Object enum158 = ((Field) term78590).get((Object) null);
        term78038 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term78041 = (Object[]) newArray("java.lang.String", 9);
        Object[] term78060 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term78038, term78038.getClass(), "allowMissingColumnNames", false);
        setField(term78038, term78038.getClass(), "commentMarker", term78039);
        setCharField(term78038, term78038.getClass(), "delimiter", 'z');
        setField(term78038, term78038.getClass(), "escapeCharacter", term78040);
        setElement(term78041, 0, "sHMXNUzNeM");
        setElement(term78041, 1, "gPzGDOEPPw");
        setElement(term78041, 2, "rwKoAngzCu");
        setElement(term78041, 3, "VUkRVwROTl");
        setElement(term78041, 4, "UDlkdccCRn");
        setElement(term78041, 5, "McpzErOcYb");
        setElement(term78041, 6, "jqrVEUvYEz");
        setElement(term78041, 7, "QITgiBrmfj");
        setElement(term78041, 8, "pXxkiXgQnq");
        setField(term78038, term78038.getClass(), "header", term78041);
        setElement(term78060, 0, "tKmrUDURku");
        setElement(term78060, 1, "JeZbrwZmsP");
        setElement(term78060, 2, "bxyfeicqrK");
        setElement(term78060, 3, "vBnWPlsZMk");
        setElement(term78060, 4, "fIZsWucfXz");
        setElement(term78060, 5, "IApvtmfhnq");
        setField(term78038, term78038.getClass(), "headerComments", term78060);
        setBooleanField(term78038, term78038.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term78038, term78038.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term78038, term78038.getClass(), "ignoreSurroundingSpaces", true);
        setField(term78038, term78038.getClass(), "nullString", "VSaNnhMpRc");
        setField(term78038, term78038.getClass(), "quoteCharacter", term78075);
        setField(term78038, term78038.getClass(), "quoteMode", enum158);
        setField(term78038, term78038.getClass(), "recordSeparator", "QNjNTLlUaV");
        setBooleanField(term78038, term78038.getClass(), "skipHeaderRecord", true);
        setBooleanField(term78038, term78038.getClass(), "trailingDelimiter", true);
        setBooleanField(term78038, term78038.getClass(), "trim", false);
        Character term77326 = new Character('d');
        Character term77329 = new Character('j');
        Character term77528 = new Character('I');
        Class<? extends Object> term78940 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term78939 = ((Class) term78940).getDeclaredField((String) "NONE");
        ((Field) term78939).setAccessible(true);
        Object enum159 = ((Field) term78939).get((Object) null);
        term77324 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term77331 = (Object[]) newArray("java.lang.String", 9);
        Object[] term77440 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term77324, term77324.getClass(), "allowMissingColumnNames", false);
        setField(term77324, term77324.getClass(), "commentMarker", term77326);
        setCharField(term77324, term77324.getClass(), "delimiter", 'f');
        setField(term77324, term77324.getClass(), "escapeCharacter", term77329);
        setElement(term77331, 0, "sHMXNUzNeM");
        setElement(term77331, 1, "gPzGDOEPPw");
        setElement(term77331, 2, "rwKoAngzCu");
        setElement(term77331, 3, "VUkRVwROTl");
        setElement(term77331, 4, "UDlkdccCRn");
        setElement(term77331, 5, "McpzErOcYb");
        setElement(term77331, 6, "jqrVEUvYEz");
        setElement(term77331, 7, "QITgiBrmfj");
        setElement(term77331, 8, "pXxkiXgQnq");
        setField(term77324, term77324.getClass(), "header", term77331);
        setElement(term77440, 0, "tKmrUDURku");
        setElement(term77440, 1, "JeZbrwZmsP");
        setElement(term77440, 2, "bxyfeicqrK");
        setElement(term77440, 3, "vBnWPlsZMk");
        setElement(term77440, 4, "fIZsWucfXz");
        setElement(term77440, 5, "IApvtmfhnq");
        setField(term77324, term77324.getClass(), "headerComments", term77440);
        setBooleanField(term77324, term77324.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term77324, term77324.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term77324, term77324.getClass(), "ignoreSurroundingSpaces", true);
        setField(term77324, term77324.getClass(), "nullString", "VSaNnhMpRc");
        setField(term77324, term77324.getClass(), "quoteCharacter", term77528);
        setField(term77324, term77324.getClass(), "quoteMode", enum159);
        setField(term77324, term77324.getClass(), "recordSeparator", "QNjNTLlUaV");
        setBooleanField(term77324, term77324.getClass(), "skipHeaderRecord", true);
        setBooleanField(term77324, term77324.getClass(), "trailingDelimiter", true);
        setBooleanField(term77324, term77324.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term19463;
        Object retValue = callMethod(klass, "withDelimiter", argTypes, term19234, args);
        assertTrue(recursiveEquals(term19234, term78038));
        assertTrue(recursiveEquals(term19463, 'f'));
        assertTrue(recursiveEquals(retValue, term77324));
    }

};


