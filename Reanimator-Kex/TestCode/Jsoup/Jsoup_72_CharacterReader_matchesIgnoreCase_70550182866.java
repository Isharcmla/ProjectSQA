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

public class CharacterReader_matchesIgnoreCase_70550182866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2795;
     Object term12051;

    public CharacterReader_matchesIgnoreCase_70550182866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2795 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2796 = (char[]) newCharArray(3);
        Object[] term2805 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term2796, 0, 'l');
        setCharElement(term2796, 1, 's');
        setCharElement(term2796, 2, 'z');
        setField(term2795, term2795.getClass(), "charBuf", term2796);
        setField(term2795, term2795.getClass(), "reader", null);
        setIntField(term2795, term2795.getClass(), "bufLength", 1072005683);
        setIntField(term2795, term2795.getClass(), "bufSplitPoint", 1861318859);
        setIntField(term2795, term2795.getClass(), "bufPos", 1474524152);
        setIntField(term2795, term2795.getClass(), "readerPos", 568954359);
        setIntField(term2795, term2795.getClass(), "bufMark", 53410913);
        setElement(term2805, 0, "sEnIVFtZuQ");
        setElement(term2805, 1, "ZVecLZMLHF");
        setElement(term2805, 2, "fztQhjqwdP");
        setElement(term2805, 3, "eVpkWxjuki");
        setField(term2795, term2795.getClass(), "stringCache", term2805);
        term12051 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term12052 = (char[]) newCharArray(3);
        Object[] term12053 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term12052, 0, 'l');
        setCharElement(term12052, 1, 's');
        setCharElement(term12052, 2, 'z');
        setField(term12051, term12051.getClass(), "charBuf", term12052);
        setField(term12051, term12051.getClass(), "reader", null);
        setIntField(term12051, term12051.getClass(), "bufLength", 1072005683);
        setIntField(term12051, term12051.getClass(), "bufSplitPoint", 1861318859);
        setIntField(term12051, term12051.getClass(), "bufPos", 1474524152);
        setIntField(term12051, term12051.getClass(), "readerPos", 568954359);
        setIntField(term12051, term12051.getClass(), "bufMark", 53410913);
        setElement(term12053, 0, "sEnIVFtZuQ");
        setElement(term12053, 1, "ZVecLZMLHF");
        setElement(term12053, 2, "fztQhjqwdP");
        setElement(term12053, 3, "eVpkWxjuki");
        setField(term12051, term12051.getClass(), "stringCache", term12053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        Object retValue = callMethod(klass, "matchesIgnoreCase", argTypes, term2795, args);
        assertTrue(recursiveEquals(term2795, term12051));
        assertTrue(recursiveEquals(retValue, false));
    }

};


