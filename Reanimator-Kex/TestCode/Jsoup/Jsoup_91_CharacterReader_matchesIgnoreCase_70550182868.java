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

public class CharacterReader_matchesIgnoreCase_70550182868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2757;
     Object term12015;

    public CharacterReader_matchesIgnoreCase_70550182868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2757 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2758 = (char[]) newCharArray(2);
        Object[] term2766 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term2758, 0, 'F');
        setCharElement(term2758, 1, 'p');
        setField(term2757, term2757.getClass(), "charBuf", term2758);
        setField(term2757, term2757.getClass(), "reader", null);
        setIntField(term2757, term2757.getClass(), "bufLength", -375014958);
        setIntField(term2757, term2757.getClass(), "bufSplitPoint", 1107176718);
        setIntField(term2757, term2757.getClass(), "bufPos", 480137250);
        setIntField(term2757, term2757.getClass(), "readerPos", -341152642);
        setIntField(term2757, term2757.getClass(), "bufMark", -2015854073);
        setElement(term2766, 0, "QXzGXbEXMu");
        setElement(term2766, 1, "qxSDVejjiY");
        setElement(term2766, 2, "xBsXSDjXYK");
        setElement(term2766, 3, "sEnIVFtZuQ");
        setElement(term2766, 4, "ZVecLZMLHF");
        setField(term2757, term2757.getClass(), "stringCache", term2766);
        term12015 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term12016 = (char[]) newCharArray(2);
        Object[] term12017 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term12016, 0, 'F');
        setCharElement(term12016, 1, 'p');
        setField(term12015, term12015.getClass(), "charBuf", term12016);
        setField(term12015, term12015.getClass(), "reader", null);
        setIntField(term12015, term12015.getClass(), "bufLength", -375014958);
        setIntField(term12015, term12015.getClass(), "bufSplitPoint", 1107176718);
        setIntField(term12015, term12015.getClass(), "bufPos", 480137250);
        setIntField(term12015, term12015.getClass(), "readerPos", -341152642);
        setIntField(term12015, term12015.getClass(), "bufMark", -2015854073);
        setElement(term12017, 0, "QXzGXbEXMu");
        setElement(term12017, 1, "qxSDVejjiY");
        setElement(term12017, 2, "xBsXSDjXYK");
        setElement(term12017, 3, "sEnIVFtZuQ");
        setElement(term12017, 4, "ZVecLZMLHF");
        setField(term12015, term12015.getClass(), "stringCache", term12017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fztQhjqwdP";
        Object retValue = callMethod(klass, "matchesIgnoreCase", argTypes, term2757, args);
        assertTrue(recursiveEquals(term2757, term12015));
        assertTrue(recursiveEquals(retValue, false));
    }

};


