package org.apache.commons.compress.compressors.bzip2;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_137545303444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4738;

    public BZip2CompressorInputStream_recvDecodingTables_137545303444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4738 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term4745 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term4764 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term4765 = (boolean[]) newBooleanArray(6);
        byte[] term4772 = (byte[]) newByteArray(3);
        byte[] term4776 = (byte[]) newByteArray(1);
        byte[] term4778 = (byte[]) newByteArray(6);
        int[] term4785 = (int[]) newIntArray(3);
        Object[] term4789 = (Object[]) newArray("[I", 5);
        int[] term4790 = (int[]) newIntArray(0);
        int[] term4791 = (int[]) newIntArray(3);
        int[] term4795 = (int[]) newIntArray(4);
        int[] term4800 = (int[]) newIntArray(9);
        int[] term4810 = (int[]) newIntArray(8);
        Object[] term4819 = (Object[]) newArray("[I", 7);
        int[] term4820 = (int[]) newIntArray(9);
        int[] term4830 = (int[]) newIntArray(8);
        int[] term4839 = (int[]) newIntArray(6);
        int[] term4846 = (int[]) newIntArray(8);
        int[] term4855 = (int[]) newIntArray(8);
        int[] term4864 = (int[]) newIntArray(6);
        int[] term4871 = (int[]) newIntArray(1);
        Object[] term4873 = (Object[]) newArray("[I", 1);
        int[] term4874 = (int[]) newIntArray(4);
        int[] term4879 = (int[]) newIntArray(1);
        int[] term4881 = (int[]) newIntArray(5);
        char[] term4887 = (char[]) newCharArray(0);
        Object[] term4888 = (Object[]) newArray("[C", 0);
        byte[] term4889 = (byte[]) newByteArray(4);
        int[] term4894 = (int[]) newIntArray(9);
        byte[] term4904 = (byte[]) newByteArray(3);
        setIntField(term4738, term4738.getClass(), "last", 1297035285);
        setIntField(term4738, term4738.getClass(), "origPtr", -826239685);
        setIntField(term4738, term4738.getClass(), "blockSize100k", -845551243);
        setBooleanField(term4738, term4738.getClass(), "blockRandomised", false);
        setIntField(term4738, term4738.getClass(), "bsBuff", 370671198);
        setIntField(term4738, term4738.getClass(), "bsLive", 1426800646);
        setIntField(term4745, term4745.getClass(), "globalCrc", -1);
        setField(term4738, term4738.getClass(), "crc", term4745);
        setIntField(term4738, term4738.getClass(), "nInUse", 954234820);
        setField(term4738, term4738.getClass(), "in", null);
        setBooleanField(term4738, term4738.getClass(), "decompressConcatenated", false);
        setIntField(term4738, term4738.getClass(), "currentChar", 1047346538);
        setIntField(term4738, term4738.getClass(), "currentState", 1841731593);
        setIntField(term4738, term4738.getClass(), "storedBlockCRC", -1854929057);
        setIntField(term4738, term4738.getClass(), "storedCombinedCRC", 1703814701);
        setIntField(term4738, term4738.getClass(), "computedBlockCRC", 1370246522);
        setIntField(term4738, term4738.getClass(), "computedCombinedCRC", -574611924);
        setIntField(term4738, term4738.getClass(), "su_count", 512521742);
        setIntField(term4738, term4738.getClass(), "su_ch2", 1291000976);
        setIntField(term4738, term4738.getClass(), "su_chPrev", 1143522832);
        setIntField(term4738, term4738.getClass(), "su_i2", 40965975);
        setIntField(term4738, term4738.getClass(), "su_j2", -194718582);
        setIntField(term4738, term4738.getClass(), "su_rNToGo", 42982854);
        setIntField(term4738, term4738.getClass(), "su_rTPos", -1129506480);
        setIntField(term4738, term4738.getClass(), "su_tPos", 301438568);
        setCharField(term4738, term4738.getClass(), "su_z", 'p');
        setBooleanElement(term4765, 0, true);
        setBooleanElement(term4765, 1, true);
        setBooleanElement(term4765, 2, true);
        setBooleanElement(term4765, 4, true);
        setBooleanElement(term4765, 5, true);
        setField(term4764, term4764.getClass(), "inUse", term4765);
        setByteElement(term4772, 0, (byte) 94);
        setByteElement(term4772, 2, (byte) -96);
        setField(term4764, term4764.getClass(), "seqToUnseq", term4772);
        setByteElement(term4776, 0, (byte) -88);
        setField(term4764, term4764.getClass(), "selector", term4776);
        setByteElement(term4778, 0, (byte) -73);
        setByteElement(term4778, 1, (byte) 105);
        setByteElement(term4778, 2, (byte) -86);
        setByteElement(term4778, 3, (byte) 84);
        setByteElement(term4778, 4, (byte) -70);
        setByteElement(term4778, 5, (byte) 84);
        setField(term4764, term4764.getClass(), "selectorMtf", term4778);
        setIntElement(term4785, 0, -1667908453);
        setIntElement(term4785, 1, 315910438);
        setIntElement(term4785, 2, -1673157821);
        setField(term4764, term4764.getClass(), "unzftab", term4785);
        setElement(term4789, 0, term4790);
        setIntElement(term4791, 0, 1217804703);
        setIntElement(term4791, 1, -1981494102);
        setIntElement(term4791, 2, -2064148945);
        setElement(term4789, 1, term4791);
        setIntElement(term4795, 0, 494400151);
        setIntElement(term4795, 1, 1588058685);
        setIntElement(term4795, 2, 1677707412);
        setIntElement(term4795, 3, -297367861);
        setElement(term4789, 2, term4795);
        setIntElement(term4800, 0, -1133541490);
        setIntElement(term4800, 1, 942412391);
        setIntElement(term4800, 2, 751596480);
        setIntElement(term4800, 3, 1971485144);
        setIntElement(term4800, 4, 2059603512);
        setIntElement(term4800, 5, -1308902065);
        setIntElement(term4800, 6, 605255795);
        setIntElement(term4800, 7, 1743438307);
        setIntElement(term4800, 8, -1122596893);
        setElement(term4789, 3, term4800);
        setIntElement(term4810, 0, -2147297900);
        setIntElement(term4810, 1, 539095138);
        setIntElement(term4810, 2, 1462297654);
        setIntElement(term4810, 3, 1009915858);
        setIntElement(term4810, 4, 500127209);
        setIntElement(term4810, 5, -1482530168);
        setIntElement(term4810, 6, -432987116);
        setIntElement(term4810, 7, 1483499310);
        setElement(term4789, 4, term4810);
        setField(term4764, term4764.getClass(), "limit", term4789);
        setIntElement(term4820, 0, -1516568587);
        setIntElement(term4820, 1, 1537690170);
        setIntElement(term4820, 2, 1133116994);
        setIntElement(term4820, 3, -1195191239);
        setIntElement(term4820, 4, -470798982);
        setIntElement(term4820, 5, 1844345719);
        setIntElement(term4820, 6, 1704024265);
        setIntElement(term4820, 7, 501801161);
        setIntElement(term4820, 8, 2103971768);
        setElement(term4819, 0, term4820);
        setIntElement(term4830, 0, -939132796);
        setIntElement(term4830, 1, 159279866);
        setIntElement(term4830, 2, 138122227);
        setIntElement(term4830, 3, 1795358995);
        setIntElement(term4830, 4, -781185864);
        setIntElement(term4830, 5, 340500914);
        setIntElement(term4830, 6, -2061712635);
        setIntElement(term4830, 7, 1182911731);
        setElement(term4819, 1, term4830);
        setIntElement(term4839, 0, 644726932);
        setIntElement(term4839, 1, -1515977761);
        setIntElement(term4839, 2, -1476037190);
        setIntElement(term4839, 3, -718204437);
        setIntElement(term4839, 4, 468974358);
        setIntElement(term4839, 5, 346282818);
        setElement(term4819, 2, term4839);
        setIntElement(term4846, 0, -857876056);
        setIntElement(term4846, 1, 1392910876);
        setIntElement(term4846, 2, 1086383182);
        setIntElement(term4846, 3, 1425319286);
        setIntElement(term4846, 4, 1729919228);
        setIntElement(term4846, 5, 872351195);
        setIntElement(term4846, 6, -1664328399);
        setIntElement(term4846, 7, 1422430512);
        setElement(term4819, 3, term4846);
        setIntElement(term4855, 0, 1796581482);
        setIntElement(term4855, 1, 1286440081);
        setIntElement(term4855, 2, -928538452);
        setIntElement(term4855, 3, -1313207353);
        setIntElement(term4855, 4, 402612318);
        setIntElement(term4855, 5, -1628481565);
        setIntElement(term4855, 6, -217226756);
        setIntElement(term4855, 7, 1608000247);
        setElement(term4819, 4, term4855);
        setIntElement(term4864, 0, 1354560887);
        setIntElement(term4864, 1, -749474542);
        setIntElement(term4864, 2, -47907780);
        setIntElement(term4864, 3, 1131462369);
        setIntElement(term4864, 4, -1161206731);
        setIntElement(term4864, 5, -992847709);
        setElement(term4819, 5, term4864);
        setIntElement(term4871, 0, 1125156671);
        setElement(term4819, 6, term4871);
        setField(term4764, term4764.getClass(), "base", term4819);
        setIntElement(term4874, 0, 1203107925);
        setIntElement(term4874, 1, 1825448944);
        setIntElement(term4874, 2, 1769496642);
        setIntElement(term4874, 3, -947460705);
        setElement(term4873, 0, term4874);
        setField(term4764, term4764.getClass(), "perm", term4873);
        setIntElement(term4879, 0, -1435758764);
        setField(term4764, term4764.getClass(), "minLens", term4879);
        setIntElement(term4881, 0, 752858379);
        setIntElement(term4881, 1, -370819357);
        setIntElement(term4881, 2, -71819242);
        setIntElement(term4881, 3, 1268893136);
        setIntElement(term4881, 4, -1472700822);
        setField(term4764, term4764.getClass(), "cftab", term4881);
        setField(term4764, term4764.getClass(), "getAndMoveToFrontDecode_yy", term4887);
        setField(term4764, term4764.getClass(), "temp_charArray2d", term4888);
        setByteElement(term4889, 0, (byte) 114);
        setByteElement(term4889, 1, (byte) 60);
        setByteElement(term4889, 2, (byte) -20);
        setByteElement(term4889, 3, (byte) 100);
        setField(term4764, term4764.getClass(), "recvDecodingTables_pos", term4889);
        setIntElement(term4894, 0, 1626670889);
        setIntElement(term4894, 1, -2117361140);
        setIntElement(term4894, 2, 407708341);
        setIntElement(term4894, 3, -287519200);
        setIntElement(term4894, 4, -1490696181);
        setIntElement(term4894, 5, 623717232);
        setIntElement(term4894, 6, -1413291732);
        setIntElement(term4894, 7, 203264365);
        setIntElement(term4894, 8, -1066281036);
        setField(term4764, term4764.getClass(), "tt", term4894);
        setByteElement(term4904, 0, (byte) -41);
        setByteElement(term4904, 1, (byte) -70);
        setByteElement(term4904, 2, (byte) -5);
        setField(term4764, term4764.getClass(), "ll8", term4904);
        setField(term4738, term4738.getClass(), "data", term4764);
        setLongField(term4738, term4738.getClass(), "bytesRead", 2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term4738, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


