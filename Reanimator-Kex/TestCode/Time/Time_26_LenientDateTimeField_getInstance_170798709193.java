package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;
import java.lang.Object;

public class LenientDateTimeField_getInstance_170798709193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18541;
     Object term23054;
     Object term23034;

    public LenientDateTimeField_getInstance_170798709193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18541 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term18627 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term18713 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term18799 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term18885 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term18971 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19057 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19143 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19229 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19315 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19401 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19487 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19573 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19659 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19745 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19831 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term19917 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20003 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20089 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20175 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20261 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20347 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20433 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20519 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20605 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20691 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20777 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20863 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term20949 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21035 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21121 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21207 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21293 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21379 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21465 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21551 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21637 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term21723 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term21637, term21637.getClass(), "iField", term21723);
        setField(term21551, term21551.getClass(), "iField", term21637);
        setField(term21465, term21465.getClass(), "iField", term21551);
        setField(term21379, term21379.getClass(), "iField", term21465);
        setField(term21293, term21293.getClass(), "iField", term21379);
        setField(term21207, term21207.getClass(), "iField", term21293);
        setField(term21121, term21121.getClass(), "iField", term21207);
        setField(term21035, term21035.getClass(), "iField", term21121);
        setField(term20949, term20949.getClass(), "iField", term21035);
        setField(term20863, term20863.getClass(), "iField", term20949);
        setField(term20777, term20777.getClass(), "iField", term20863);
        setField(term20691, term20691.getClass(), "iField", term20777);
        setField(term20605, term20605.getClass(), "iField", term20691);
        setField(term20519, term20519.getClass(), "iField", term20605);
        setField(term20433, term20433.getClass(), "iField", term20519);
        setField(term20347, term20347.getClass(), "iField", term20433);
        setField(term20261, term20261.getClass(), "iField", term20347);
        setField(term20175, term20175.getClass(), "iField", term20261);
        setField(term20089, term20089.getClass(), "iField", term20175);
        setField(term20003, term20003.getClass(), "iField", term20089);
        setField(term19917, term19917.getClass(), "iField", term20003);
        setField(term19831, term19831.getClass(), "iField", term19917);
        setField(term19745, term19745.getClass(), "iField", term19831);
        setField(term19659, term19659.getClass(), "iField", term19745);
        setField(term19573, term19573.getClass(), "iField", term19659);
        setField(term19487, term19487.getClass(), "iField", term19573);
        setField(term19401, term19401.getClass(), "iField", term19487);
        setField(term19315, term19315.getClass(), "iField", term19401);
        setField(term19229, term19229.getClass(), "iField", term19315);
        setField(term19143, term19143.getClass(), "iField", term19229);
        setField(term19057, term19057.getClass(), "iField", term19143);
        setField(term18971, term18971.getClass(), "iField", term19057);
        setField(term18885, term18885.getClass(), "iField", term18971);
        setField(term18799, term18799.getClass(), "iField", term18885);
        setField(term18713, term18713.getClass(), "iField", term18799);
        setField(term18627, term18627.getClass(), "iField", term18713);
        setField(term18541, term18541.getClass(), "iField", term18627);
        term23054 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term23055 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term23056 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term23057 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term23058 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        setIntField(term23054, term23054.getClass(), "iDivisor", 0);
        setField(term23054, term23054.getClass(), "iDurationField", null);
        setIntField(term23054, term23054.getClass(), "iMin", 0);
        setIntField(term23054, term23054.getClass(), "iMax", 0);
        setIntField(term23055, term23055.getClass(), "iDivisor", 0);
        setField(term23055, term23055.getClass(), "iDurationField", null);
        setIntField(term23055, term23055.getClass(), "iMin", 0);
        setIntField(term23055, term23055.getClass(), "iMax", 0);
        setIntField(term23056, term23056.getClass(), "iDivisor", 0);
        setField(term23056, term23056.getClass(), "iDurationField", null);
        setIntField(term23056, term23056.getClass(), "iMin", 0);
        setIntField(term23056, term23056.getClass(), "iMax", 0);
        setIntField(term23057, term23057.getClass(), "iDivisor", 0);
        setField(term23057, term23057.getClass(), "iDurationField", null);
        setIntField(term23057, term23057.getClass(), "iMin", 0);
        setIntField(term23057, term23057.getClass(), "iMax", 0);
        setIntField(term23058, term23058.getClass(), "iDivisor", 0);
        setField(term23058, term23058.getClass(), "iDurationField", null);
        setIntField(term23058, term23058.getClass(), "iMin", 0);
        setIntField(term23058, term23058.getClass(), "iMax", 0);
        setField(term23058, term23058.getClass(), "iField", null);
        setField(term23058, term23058.getClass(), "iType", null);
        setField(term23057, term23057.getClass(), "iField", term23058);
        setField(term23057, term23057.getClass(), "iType", null);
        setField(term23056, term23056.getClass(), "iField", term23057);
        setField(term23056, term23056.getClass(), "iType", null);
        setField(term23055, term23055.getClass(), "iField", term23056);
        setField(term23055, term23055.getClass(), "iType", null);
        setField(term23054, term23054.getClass(), "iField", term23055);
        setField(term23054, term23054.getClass(), "iType", null);
        term23034 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term23038 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term23042 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term23046 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term23050 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        setIntField(term23034, term23034.getClass(), "iDivisor", 0);
        setField(term23034, term23034.getClass(), "iDurationField", null);
        setIntField(term23034, term23034.getClass(), "iMin", 0);
        setIntField(term23034, term23034.getClass(), "iMax", 0);
        setIntField(term23038, term23038.getClass(), "iDivisor", 0);
        setField(term23038, term23038.getClass(), "iDurationField", null);
        setIntField(term23038, term23038.getClass(), "iMin", 0);
        setIntField(term23038, term23038.getClass(), "iMax", 0);
        setIntField(term23042, term23042.getClass(), "iDivisor", 0);
        setField(term23042, term23042.getClass(), "iDurationField", null);
        setIntField(term23042, term23042.getClass(), "iMin", 0);
        setIntField(term23042, term23042.getClass(), "iMax", 0);
        setIntField(term23046, term23046.getClass(), "iDivisor", 0);
        setField(term23046, term23046.getClass(), "iDurationField", null);
        setIntField(term23046, term23046.getClass(), "iMin", 0);
        setIntField(term23046, term23046.getClass(), "iMax", 0);
        setIntField(term23050, term23050.getClass(), "iDivisor", 0);
        setField(term23050, term23050.getClass(), "iDurationField", null);
        setIntField(term23050, term23050.getClass(), "iMin", 0);
        setIntField(term23050, term23050.getClass(), "iMax", 0);
        setField(term23050, term23050.getClass(), "iField", null);
        setField(term23050, term23050.getClass(), "iType", null);
        setField(term23046, term23046.getClass(), "iField", term23050);
        setField(term23046, term23046.getClass(), "iType", null);
        setField(term23042, term23042.getClass(), "iField", term23046);
        setField(term23042, term23042.getClass(), "iType", null);
        setField(term23038, term23038.getClass(), "iField", term23042);
        setField(term23038, term23038.getClass(), "iType", null);
        setField(term23034, term23034.getClass(), "iField", term23038);
        setField(term23034, term23034.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term18541;
        args[1] = null;
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(term18541, term23054));
        assertTrue(recursiveEquals(retValue, term23034));
    }

};


