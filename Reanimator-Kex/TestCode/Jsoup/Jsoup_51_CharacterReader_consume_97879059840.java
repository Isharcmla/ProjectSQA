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

public class CharacterReader_consume_97879059840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;
     Object term5103;

    public CharacterReader_consume_97879059840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term368 = (char[]) newCharArray(2);
        Object[] term374 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term368, 0, 'D');
        setCharElement(term368, 1, 's');
        setField(term367, term367.getClass(), "input", term368);
        setIntField(term367, term367.getClass(), "length", -1339778481);
        setIntField(term367, term367.getClass(), "pos", 1725571209);
        setIntField(term367, term367.getClass(), "mark", -522618178);
        setElement(term374, 0, "aJlieCFVtF");
        setElement(term374, 1, "ZiaGIbnzTs");
        setElement(term374, 2, "tbcdzjIfER");
        setElement(term374, 3, "HyxfbSQYBe");
        setElement(term374, 4, "pCTimMblYc");
        setElement(term374, 5, "hNxWaHcfhY");
        setField(term367, term367.getClass(), "stringCache", term374);
        term5103 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5104 = (char[]) newCharArray(2);
        Object[] term5105 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term5104, 0, 'D');
        setCharElement(term5104, 1, 's');
        setField(term5103, term5103.getClass(), "input", term5104);
        setIntField(term5103, term5103.getClass(), "length", -1339778481);
        setIntField(term5103, term5103.getClass(), "pos", 1725571210);
        setIntField(term5103, term5103.getClass(), "mark", -522618178);
        setElement(term5105, 0, "aJlieCFVtF");
        setElement(term5105, 1, "ZiaGIbnzTs");
        setElement(term5105, 2, "tbcdzjIfER");
        setElement(term5105, 3, "HyxfbSQYBe");
        setElement(term5105, 4, "pCTimMblYc");
        setElement(term5105, 5, "hNxWaHcfhY");
        setField(term5103, term5103.getClass(), "stringCache", term5105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consume", argTypes, term367, args);
        assertTrue(recursiveEquals(term367, term5103));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


