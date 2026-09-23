package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_consumeTo_169485570956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1279;
     Object term8287;

    public CharacterReader_consumeTo_169485570956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1279 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1280 = (char[]) newCharArray(5);
        Object[] term1291 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term1280, 0, 'S');
        setCharElement(term1280, 1, 'b');
        setCharElement(term1280, 2, 'S');
        setCharElement(term1280, 3, 'z');
        setCharElement(term1280, 4, 'j');
        setField(term1279, term1279.getClass(), "charBuf", term1280);
        setField(term1279, term1279.getClass(), "reader", null);
        setIntField(term1279, term1279.getClass(), "bufLength", -1588772968);
        setIntField(term1279, term1279.getClass(), "bufSplitPoint", -93135961);
        setIntField(term1279, term1279.getClass(), "bufPos", -112921587);
        setIntField(term1279, term1279.getClass(), "readerPos", 933028652);
        setIntField(term1279, term1279.getClass(), "bufMark", 287287233);
        setElement(term1291, 0, "xLbjWUgOIL");
        setElement(term1291, 1, "jDtqGUpnZN");
        setElement(term1291, 2, "nGKItKLYNC");
        setField(term1279, term1279.getClass(), "stringCache", term1291);
        term8287 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term8288 = (char[]) newCharArray(5);
        Object[] term8289 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term8288, 0, 'S');
        setCharElement(term8288, 1, 'b');
        setCharElement(term8288, 2, 'S');
        setCharElement(term8288, 3, 'z');
        setCharElement(term8288, 4, 'j');
        setField(term8287, term8287.getClass(), "charBuf", term8288);
        setField(term8287, term8287.getClass(), "reader", null);
        setIntField(term8287, term8287.getClass(), "bufLength", -1588772968);
        setIntField(term8287, term8287.getClass(), "bufSplitPoint", -93135961);
        setIntField(term8287, term8287.getClass(), "bufPos", -1588772968);
        setIntField(term8287, term8287.getClass(), "readerPos", 933028652);
        setIntField(term8287, term8287.getClass(), "bufMark", 287287233);
        setElement(term8289, 0, "xLbjWUgOIL");
        setElement(term8289, 1, "jDtqGUpnZN");
        setElement(term8289, 2, "nGKItKLYNC");
        setField(term8287, term8287.getClass(), "stringCache", term8289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        Object retValue = callMethod(klass, "consumeTo", argTypes, term1279, args);
        assertTrue(recursiveEquals(term1279, term8287));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


