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

public class CharacterReader_consumeHexSequence_393737519593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6158635;

    public CharacterReader_consumeHexSequence_393737519593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6158635 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term6158225 = (char[]) newCharArray(0);
        setIntField(term6158635, term6158635.getClass(), "pos", -1879048197);
        setIntField(term6158635, term6158635.getClass(), "length", 268435471);
        setCharElement(term6158225, -1879048197, 'd');
        setCharElement(term6158225, -1879048196, (char) 48);
        setCharElement(term6158225, -1879048195, (char) 48);
        setCharElement(term6158225, -1879048194, (char) 48);
        setCharElement(term6158225, -1879048193, 'b');
        setCharElement(term6158225, -1879048192, 'b');
        setCharElement(term6158225, -1879048191, 'b');
        setCharElement(term6158225, -1879048190, 'b');
        setCharElement(term6158225, -1879048189, 'b');
        setCharElement(term6158225, -1879048188, 'b');
        setCharElement(term6158225, -1879048187, 'b');
        setCharElement(term6158225, -1879048186, 'b');
        setCharElement(term6158225, -1879048185, 'b');
        setCharElement(term6158225, -1879048184, 'b');
        setCharElement(term6158225, -1879048183, 'b');
        setCharElement(term6158225, -1879048182, 'b');
        setCharElement(term6158225, -1879048181, 'b');
        setCharElement(term6158225, -1879048180, 'b');
        setCharElement(term6158225, -1879048179, 'b');
        setCharElement(term6158225, -1879048178, 'G');
        setField(term6158635, term6158635.getClass(), "input", term6158225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term6158635, args);
    }

};


