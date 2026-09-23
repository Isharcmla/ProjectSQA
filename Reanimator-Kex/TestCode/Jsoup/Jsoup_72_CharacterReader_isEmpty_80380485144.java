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

public class CharacterReader_isEmpty_80380485144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;
     Object term5728;

    public CharacterReader_isEmpty_80380485144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term234 = (char[]) newCharArray(1);
        Object[] term241 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term234, 0, 'T');
        setField(term233, term233.getClass(), "charBuf", term234);
        setField(term233, term233.getClass(), "reader", null);
        setIntField(term233, term233.getClass(), "bufLength", -522618178);
        setIntField(term233, term233.getClass(), "bufSplitPoint", 1134449235);
        setIntField(term233, term233.getClass(), "bufPos", -883034806);
        setIntField(term233, term233.getClass(), "readerPos", 1585847225);
        setIntField(term233, term233.getClass(), "bufMark", 597278769);
        setElement(term241, 0, "RMFIsYGgne");
        setElement(term241, 1, "NRdvgJlhkX");
        setElement(term241, 2, "uuaPigETmJ");
        setElement(term241, 3, "MxlszYVzRf");
        setElement(term241, 4, "LQFpaHEwXR");
        setElement(term241, 5, "oVcInYnLWB");
        setField(term233, term233.getClass(), "stringCache", term241);
        term5728 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5729 = (char[]) newCharArray(1);
        Object[] term5730 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term5729, 0, 'T');
        setField(term5728, term5728.getClass(), "charBuf", term5729);
        setField(term5728, term5728.getClass(), "reader", null);
        setIntField(term5728, term5728.getClass(), "bufLength", -522618178);
        setIntField(term5728, term5728.getClass(), "bufSplitPoint", 1134449235);
        setIntField(term5728, term5728.getClass(), "bufPos", -883034806);
        setIntField(term5728, term5728.getClass(), "readerPos", 1585847225);
        setIntField(term5728, term5728.getClass(), "bufMark", 597278769);
        setElement(term5730, 0, "RMFIsYGgne");
        setElement(term5730, 1, "NRdvgJlhkX");
        setElement(term5730, 2, "uuaPigETmJ");
        setElement(term5730, 3, "MxlszYVzRf");
        setElement(term5730, 4, "LQFpaHEwXR");
        setElement(term5730, 5, "oVcInYnLWB");
        setField(term5728, term5728.getClass(), "stringCache", term5730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term233, args);
        assertTrue(recursiveEquals(term233, term5728));
        assertTrue(recursiveEquals(retValue, false));
    }

};


