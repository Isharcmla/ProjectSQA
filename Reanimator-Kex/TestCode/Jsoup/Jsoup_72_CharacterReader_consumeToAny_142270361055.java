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

public class CharacterReader_consumeToAny_142270361055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;
     Object term1350;
     Object term8335;
     Object term8344;

    public CharacterReader_consumeToAny_142270361055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1301 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1302 = (char[]) newCharArray(5);
        Object[] term1313 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term1302, 0, 'S');
        setCharElement(term1302, 1, 'b');
        setCharElement(term1302, 2, 'S');
        setCharElement(term1302, 3, 'z');
        setCharElement(term1302, 4, 'j');
        setField(term1301, term1301.getClass(), "charBuf", term1302);
        setField(term1301, term1301.getClass(), "reader", null);
        setIntField(term1301, term1301.getClass(), "bufLength", -1588772968);
        setIntField(term1301, term1301.getClass(), "bufSplitPoint", -93135961);
        setIntField(term1301, term1301.getClass(), "bufPos", -112921587);
        setIntField(term1301, term1301.getClass(), "readerPos", 933028652);
        setIntField(term1301, term1301.getClass(), "bufMark", 287287233);
        setElement(term1313, 0, "jDtqGUpnZN");
        setElement(term1313, 1, "nGKItKLYNC");
        setElement(term1313, 2, "UiUYnPrcCi");
        setField(term1301, term1301.getClass(), "stringCache", term1313);
        term1350 = (char[]) newCharArray(7);
        setCharElement(term1350, 0, 'V');
        setCharElement(term1350, 1, 'p');
        setCharElement(term1350, 2, 'O');
        setCharElement(term1350, 3, 'Q');
        setCharElement(term1350, 4, 'T');
        setCharElement(term1350, 5, 'y');
        setCharElement(term1350, 6, 'S');
        term8335 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term8336 = (char[]) newCharArray(5);
        Object[] term8337 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term8336, 0, 'S');
        setCharElement(term8336, 1, 'b');
        setCharElement(term8336, 2, 'S');
        setCharElement(term8336, 3, 'z');
        setCharElement(term8336, 4, 'j');
        setField(term8335, term8335.getClass(), "charBuf", term8336);
        setField(term8335, term8335.getClass(), "reader", null);
        setIntField(term8335, term8335.getClass(), "bufLength", -1588772968);
        setIntField(term8335, term8335.getClass(), "bufSplitPoint", -93135961);
        setIntField(term8335, term8335.getClass(), "bufPos", -112921587);
        setIntField(term8335, term8335.getClass(), "readerPos", 933028652);
        setIntField(term8335, term8335.getClass(), "bufMark", 287287233);
        setElement(term8337, 0, "jDtqGUpnZN");
        setElement(term8337, 1, "nGKItKLYNC");
        setElement(term8337, 2, "UiUYnPrcCi");
        setField(term8335, term8335.getClass(), "stringCache", term8337);
        term8344 = (char[]) newCharArray(7);
        setCharElement(term8344, 0, 'V');
        setCharElement(term8344, 1, 'p');
        setCharElement(term8344, 2, 'O');
        setCharElement(term8344, 3, 'Q');
        setCharElement(term8344, 4, 'T');
        setCharElement(term8344, 5, 'y');
        setCharElement(term8344, 6, 'S');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1350;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term1301, args);
        assertTrue(recursiveEquals(term1301, term8335));
        assertTrue(recursiveEquals(term1350, term8344));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


