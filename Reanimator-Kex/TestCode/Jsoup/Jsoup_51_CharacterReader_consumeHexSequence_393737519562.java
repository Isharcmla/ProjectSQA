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

public class CharacterReader_consumeHexSequence_393737519562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5120363;

    public CharacterReader_consumeHexSequence_393737519562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5120363 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5119356 = (char[]) newCharArray(19);
        setIntField(term5120363, term5120363.getClass(), "pos", -2139095044);
        setIntField(term5120363, term5120363.getClass(), "length", 8388636);
        setCharElement(term5119356, 0, 'b');
        setCharElement(term5119356, 1, 'b');
        setCharElement(term5119356, 2, 'b');
        setCharElement(term5119356, 3, 'b');
        setCharElement(term5119356, 4, 'b');
        setCharElement(term5119356, 5, 'b');
        setCharElement(term5119356, 6, 'b');
        setCharElement(term5119356, 7, 'b');
        setCharElement(term5119356, 8, 'b');
        setCharElement(term5119356, 9, 'b');
        setCharElement(term5119356, 10, 'b');
        setCharElement(term5119356, 11, 'b');
        setCharElement(term5119356, 12, 'b');
        setCharElement(term5119356, 13, 'b');
        setCharElement(term5119356, 14, 'b');
        setCharElement(term5119356, 15, 'b');
        setCharElement(term5119356, 16, 'b');
        setCharElement(term5119356, 17, 'b');
        setCharElement(term5119356, 18, 'b');
        setCharElement(term5119356, -2139095044, 'd');
        setCharElement(term5119356, -2139095043, (char) 48);
        setCharElement(term5119356, -2139095042, (char) 48);
        setCharElement(term5119356, -2139095041, (char) 48);
        setCharElement(term5119356, -2139095040, 'b');
        setCharElement(term5119356, -2139095039, 'b');
        setCharElement(term5119356, -2139095038, 'b');
        setCharElement(term5119356, -2139095037, 'b');
        setCharElement(term5119356, -2139095036, 'b');
        setCharElement(term5119356, -2139095035, 'b');
        setCharElement(term5119356, -2139095034, 'b');
        setCharElement(term5119356, -2139095033, 'b');
        setCharElement(term5119356, -2139095032, 'b');
        setCharElement(term5119356, -2139095031, 'b');
        setCharElement(term5119356, -2139095030, 'b');
        setCharElement(term5119356, -2139095029, 'b');
        setCharElement(term5119356, -2139095028, 'b');
        setCharElement(term5119356, -2139095027, 'b');
        setCharElement(term5119356, -2139095026, 'b');
        setCharElement(term5119356, -2139095025, 'b');
        setCharElement(term5119356, -2139095024, 'b');
        setCharElement(term5119356, -2139095023, 'b');
        setCharElement(term5119356, -2139095022, 'b');
        setCharElement(term5119356, -2139095021, 'b');
        setCharElement(term5119356, -2139095020, 'b');
        setCharElement(term5119356, -2139095019, 'g');
        setField(term5120363, term5120363.getClass(), "input", term5119356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term5120363, args);
    }

};


