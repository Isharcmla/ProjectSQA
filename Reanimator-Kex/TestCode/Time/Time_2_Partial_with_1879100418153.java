package org.joda.time;

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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_with_1879100418153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659810;
     Object term663410;

    public Partial_with_1879100418153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659810 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term658423 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 213);
        Object term659930 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term660050 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term660170 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term660290 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term660410 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term660530 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term660650 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term660770 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term660890 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661010 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661130 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661250 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661370 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661490 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661610 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661730 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661850 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term661970 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term662090 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term662210 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term662330 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term662450 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term662570 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term662690 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term662810 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term662930 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term663050 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term663170 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term663290 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term658423, 0, term659930);
        setElement(term658423, 1, term660050);
        setElement(term658423, 2, term660170);
        setElement(term658423, 3, term660290);
        setElement(term658423, 6, term660410);
        setElement(term658423, 7, term660530);
        setElement(term658423, 8, term660650);
        setElement(term658423, 9, term660770);
        setElement(term658423, 10, term660170);
        setElement(term658423, 12, term660890);
        setElement(term658423, 13, term661010);
        setElement(term658423, 14, term661130);
        setElement(term658423, 15, term661130);
        setElement(term658423, 17, term661250);
        setElement(term658423, 18, term660290);
        setElement(term658423, 19, term661370);
        setElement(term658423, 21, term661490);
        setElement(term658423, 23, term660170);
        setElement(term658423, 26, term661610);
        setElement(term658423, 27, term661250);
        setElement(term658423, 28, term661730);
        setElement(term658423, 29, term661850);
        setElement(term658423, 30, term661970);
        setElement(term658423, 31, term662090);
        setElement(term658423, 32, term661130);
        setElement(term658423, 36, term661010);
        setElement(term658423, 37, term662210);
        setElement(term658423, 38, term660050);
        setElement(term658423, 39, term661970);
        setElement(term658423, 40, term660650);
        setElement(term658423, 41, term661850);
        setElement(term658423, 43, term661730);
        setElement(term658423, 44, term662330);
        setElement(term658423, 45, term661730);
        setElement(term658423, 47, term660170);
        setElement(term658423, 54, term660170);
        setElement(term658423, 55, term660170);
        setElement(term658423, 57, term661250);
        setElement(term658423, 58, term662450);
        setElement(term658423, 59, term661610);
        setElement(term658423, 60, term662570);
        setElement(term658423, 64, term661250);
        setElement(term658423, 65, term661370);
        setElement(term658423, 76, term661730);
        setElement(term658423, 79, term662690);
        setElement(term658423, 80, term661370);
        setElement(term658423, 81, term661610);
        setElement(term658423, 82, term661970);
        setElement(term658423, 83, term661130);
        setElement(term658423, 84, term662810);
        setElement(term658423, 85, term662930);
        setElement(term658423, 86, term661730);
        setElement(term658423, 87, term663050);
        setElement(term658423, 89, term661490);
        setElement(term658423, 90, term662570);
        setElement(term658423, 91, term661010);
        setElement(term658423, 95, term661010);
        setElement(term658423, 96, term660290);
        setElement(term658423, 100, term662930);
        setElement(term658423, 103, term660050);
        setElement(term658423, 104, term663170);
        setElement(term658423, 108, term661130);
        setElement(term658423, 111, term660170);
        setElement(term658423, 112, term660170);
        setElement(term658423, 113, term660170);
        setElement(term658423, 114, term660170);
        setElement(term658423, 115, term660170);
        setElement(term658423, 116, term660170);
        setElement(term658423, 117, term660170);
        setElement(term658423, 118, term660170);
        setElement(term658423, 119, term660170);
        setElement(term658423, 120, term660170);
        setElement(term658423, 121, term663290);
        setElement(term658423, 122, term660170);
        setElement(term658423, 123, term661610);
        setElement(term658423, 124, term660170);
        setElement(term658423, 125, term660170);
        setElement(term658423, 126, term660170);
        setElement(term658423, 127, term660530);
        setElement(term658423, 128, term660170);
        setElement(term658423, 129, term660890);
        setElement(term658423, 130, term663290);
        setElement(term658423, 131, term660170);
        setElement(term658423, 132, term660170);
        setElement(term658423, 133, term660170);
        setElement(term658423, 134, term661850);
        setElement(term658423, 135, term660170);
        setElement(term658423, 136, term660170);
        setElement(term658423, 137, term660170);
        setElement(term658423, 138, term660170);
        setElement(term658423, 139, term660170);
        setElement(term658423, 140, term660170);
        setElement(term658423, 141, term660170);
        setElement(term658423, 142, term660170);
        setElement(term658423, 143, term660170);
        setElement(term658423, 144, term660170);
        setElement(term658423, 145, term660170);
        setElement(term658423, 146, term660170);
        setElement(term658423, 147, term660170);
        setElement(term658423, 148, term660170);
        setElement(term658423, 150, term660170);
        setElement(term658423, 151, term660170);
        setElement(term658423, 152, term660170);
        setElement(term658423, 153, term660170);
        setElement(term658423, 154, term660170);
        setElement(term658423, 155, term660170);
        setElement(term658423, 156, term660170);
        setElement(term658423, 157, term660170);
        setElement(term658423, 158, term660170);
        setElement(term658423, 159, term660170);
        setElement(term658423, 160, term660170);
        setElement(term658423, 161, term660170);
        setElement(term658423, 162, term660170);
        setElement(term658423, 163, term660170);
        setElement(term658423, 164, term661730);
        setElement(term658423, 165, term660170);
        setElement(term658423, 166, term660170);
        setElement(term658423, 167, term660170);
        setElement(term658423, 168, term660170);
        setElement(term658423, 169, term660170);
        setElement(term658423, 170, term660170);
        setElement(term658423, 171, term660170);
        setElement(term658423, 172, term660170);
        setElement(term658423, 173, term660170);
        setElement(term658423, 174, term660170);
        setElement(term658423, 175, term660170);
        setElement(term658423, 176, term660170);
        setElement(term658423, 177, term660170);
        setElement(term658423, 178, term660170);
        setElement(term658423, 179, term660170);
        setElement(term658423, 180, term660410);
        setElement(term658423, 181, term660170);
        setElement(term658423, 182, term660170);
        setElement(term658423, 183, term660170);
        setElement(term658423, 184, term660170);
        setElement(term658423, 185, term660170);
        setElement(term658423, 186, term660170);
        setElement(term658423, 187, term660170);
        setElement(term658423, 188, term662930);
        setElement(term658423, 189, term660170);
        setElement(term658423, 190, term660170);
        setElement(term658423, 191, term660170);
        setElement(term658423, 192, term660170);
        setElement(term658423, 193, term660170);
        setElement(term658423, 194, term660170);
        setElement(term658423, 195, term660170);
        setElement(term658423, 196, term660890);
        setElement(term658423, 197, term662570);
        setElement(term658423, 198, term662930);
        setElement(term658423, 199, term660650);
        setElement(term658423, 200, term660410);
        setElement(term658423, 201, term661010);
        setElement(term658423, 202, term661250);
        setElement(term658423, 203, term662090);
        setElement(term658423, 204, term661010);
        setElement(term658423, 205, term659930);
        setElement(term658423, 206, term660290);
        setElement(term658423, 207, term662090);
        setElement(term658423, 208, term660770);
        setElement(term658423, 209, term662930);
        setElement(term658423, 210, term661490);
        setElement(term658423, 211, term660410);
        setElement(term658423, 212, term661010);
        setField(term659810, term659810.getClass(), "iTypes", term658423);
        term663410 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term663410;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term659810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


